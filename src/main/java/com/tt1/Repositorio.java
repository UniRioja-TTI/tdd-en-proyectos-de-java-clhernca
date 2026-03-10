package com.tt1;

import java.util.ArrayList;
import java.util.List;

/**
 * Implementación del repositorio de tareas y emails.
 * Actúa como capa intermedia entre el servicio y la base de datos,
 * delegando las operaciones en una implementación de {@link IDBStub}.
 *
 * @author Clara
 * @version 1.0
 */
public class Repositorio implements IRepositorio {
    private IDBStub db;

    /**
     * Constructor del repositorio.
     * @param db implementación de la base de datos a utilizar
     */
    public Repositorio(IDBStub db) {
        this.db = db;
    }

    /**
     * Guarda una nueva tarea en la base de datos.
     * @param todo la tarea {@link ToDo} a guardar
     */
    public void guardarToDo(ToDo todo) {
        db.añadirToDo(todo);
    }

    /**
     * Busca y devuelve una tarea por su nombre.
     * @param nombre el nombre de la tarea a buscar
     * @return la tarea {@link ToDo} correspondiente, o {@code null} si no se encuentra
     */
    public ToDo encontrarToDo(String nombre) {
        for (ToDo t : db.obtenerTodos()) {
            if (t.getNombre().equals(nombre)) {
                return t;
            }
        }
        return null;
    }

    /**
     * Marca como completada la tarea con el nombre indicado.
     * @param nombre el nombre de la tarea a marcar como completada
     */
    public void marcarCompletado(String nombre) {
        db.marcarCompletado(nombre);
    }

    /**
     * Obtiene la lista de tareas que aún no han sido completadas.
     * @return lista de objetos {@link ToDo} con estado pendiente
     */
    public List<ToDo> obtenerPendientes() {
        List<ToDo> pendientes = new ArrayList<>();
        for (ToDo t : db.obtenerTodos()) {
            if (!t.isCompletado()) {
                pendientes.add(t);
            }
        }
        return pendientes;
    }

    /**
     * Guarda una dirección de email en la base de datos.
     * @param email la dirección de correo electrónico a guardar
     */
    public void guardarEmail(String email) {
        db.añadirEmail(email);
    }

    /**
     * Obtiene la lista de emails registrados en la base de datos.
     * @return lista de direcciones de correo electrónico registradas
     */
    public List<String> obtenerEmails() {
        return db.obtenerEmails();
    }
}