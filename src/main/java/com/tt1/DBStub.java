package com.tt1;

import java.util.ArrayList;
import java.util.List;

public class DBStub implements IDBStub {
    private List<ToDo> tareas = new ArrayList<>();
    private List<String> emails = new ArrayList<>();
    
    public void añadirToDo(ToDo todo) {
        tareas.add(todo);
    }

    public List<ToDo> obtenerTodos() {
        return tareas;
    }

    public void marcarCompletado(String nombre) {
        for (ToDo t : tareas) {
            if (t.getNombre().equals(nombre)) {
                t.setCompletado(true);
            }
        }
    }

    public void eliminarToDo(String nombre) {
        for (int i = 0; i < tareas.size(); i++) {
            if (tareas.get(i).getNombre().equals(nombre)) {
                tareas.remove(i);
                break;
            }
        }
    }

    public void añadirEmail(String email) {
        emails.add(email);
    }

    public List<String> obtenerEmails() {
        return emails;
    }
}