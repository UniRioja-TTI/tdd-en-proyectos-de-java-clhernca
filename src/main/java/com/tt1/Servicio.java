package com.tt1;

import java.time.LocalDate;
import java.util.List;

public class Servicio {
    private IRepositorio repositorio;
    private IMailerStub mailer;
    
    public Servicio(IRepositorio repositorio, IMailerStub mailer) {
        this.repositorio = repositorio;
        this.mailer = mailer;
    }
    
    public void crearToDo(String nombre, LocalDate fechaLimite) {
        ToDo todo = new ToDo();
        todo.setNombre(nombre);
        todo.setFechaLimite(fechaLimite);
        repositorio.guardarToDo(todo);
        comprobarVencidosYAlertar();
    }

    public void agregarEmail(String email) {
        repositorio.guardarEmail(email);
        comprobarVencidosYAlertar();
    }

    public void marcarComoFinalizada(String nombre) {
        repositorio.marcarCompletado(nombre);
        comprobarVencidosYAlertar();
    }

    public List<ToDo> listarPendientes() {
        comprobarVencidosYAlertar();
        return repositorio.obtenerPendientes();
    }

    private void comprobarVencidosYAlertar() {
        List<ToDo> pendientes = repositorio.obtenerPendientes();
        List<String> emails = repositorio.obtenerEmails();

        for (ToDo t : pendientes) {
            if (t.getFechaLimite().isBefore(LocalDate.now())) {
                for (String email : emails) {
                    mailer.enviarCorreo(email, "Tarea vencida: " + t.getNombre());
                }
            }
        }
    }
}