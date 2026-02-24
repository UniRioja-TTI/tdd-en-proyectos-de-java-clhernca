package com.tt1;

import java.util.ArrayList;
import java.util.List;

public class Repositorio implements IRepositorio {
    private IDBStub db;
    
    public Repositorio(IDBStub db) {
        this.db = db;
    }
    
    public void guardarToDo(ToDo todo) {
        db.añadirToDo(todo);
    }

    public ToDo encontrarToDo(String nombre) {
        for (ToDo t : db.obtenerTodos()) {
            if (t.getNombre().equals(nombre)) {
                return t;
            }
        }
        return null;
    }

    public void marcarCompletado(String nombre) {
        db.marcarCompletado(nombre);
    }

    public List<ToDo> obtenerPendientes() {
        List<ToDo> pendientes = new ArrayList<>();
        for (ToDo t : db.obtenerTodos()) {
            if (!t.isCompletado()) {
                pendientes.add(t);
            }
        }
        return pendientes;
    }

    public void guardarEmail(String email) {
        db.añadirEmail(email);
    }

    public List<String> obtenerEmails() {
        return db.obtenerEmails();
    }
}