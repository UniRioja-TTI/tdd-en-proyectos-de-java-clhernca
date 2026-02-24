package com.tt1.mock;

import com.tt1.IDBStub;
import com.tt1.ToDo;
import java.util.ArrayList;
import java.util.List;

public class FakeDBStub implements IDBStub {
    private List<ToDo> tareas = new ArrayList<>();
    private List<String> emails = new ArrayList<>();

    @Override
    public void añadirToDo(ToDo todo) { tareas.add(todo); }

    @Override
    public List<ToDo> obtenerTodos() { return tareas; }

    @Override
    public void marcarCompletado(String nombre) {
        tareas.stream()
              .filter(t -> t.getNombre().equals(nombre))
              .findFirst()
              .ifPresent(t -> t.setCompletado(true));
    }

    @Override
    public void eliminarToDo(String nombre) {
        tareas.removeIf(t -> t.getNombre().equals(nombre));
    }

    @Override
    public void añadirEmail(String email) { emails.add(email); }

    @Override
    public List<String> obtenerEmails() { return emails; }
}