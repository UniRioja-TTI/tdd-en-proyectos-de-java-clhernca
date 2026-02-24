package com.tt1;

import java.util.ArrayList;
import java.util.List;

public class DBStub {
    private List<ToDo> tareas = new ArrayList<>();
    private List<String> emails = new ArrayList<>();

    public void añadirToDo(ToDo todo) {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    public List<ToDo> obtenerTodos() {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    public void marcarCompletado(String nombre) {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    public void eliminarToDo(String nombre) {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    public void añadirEmail(String email) {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    public List<String> obtenerEmails() {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }
}