package com.tt1;

import java.time.LocalDate;

public class Servicio {
    private IRepositorio repositorio;
    private IMailerStub mailer;
    
    public Servicio(IRepositorio repositorio, IMailerStub mailer) {
        this.repositorio = repositorio;
        this.mailer = mailer;
    }

    public void crearToDo(String nombre, LocalDate fechaLimite) {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    public void agregarEmail(String email) {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    public void marcarComoFinalizada(String nombre) {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    public void listarPendientes() {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    private void comprobarVencidosYAlertar() {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }
}