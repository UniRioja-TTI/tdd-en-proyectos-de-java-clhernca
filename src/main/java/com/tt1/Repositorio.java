package com.tt1;

import java.util.List;

public class Repositorio {
    private DBStub db = new DBStub();

    public void guardarToDo(ToDo todo) {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    public ToDo encontrarToDo(String nombre) {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    public void marcarCompletado(String nombre) {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    public List<ToDo> obtenerPendientes() {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    public void guardarEmail(String email) {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    public List<String> obtenerEmails() {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }
}