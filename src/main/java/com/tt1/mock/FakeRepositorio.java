package com.tt1.mock;

import com.tt1.IRepositorio;
import com.tt1.ToDo;
import java.util.ArrayList;
import java.util.List;

public class FakeRepositorio implements IRepositorio {
    private List<ToDo> tareas = new ArrayList<>();
    private List<String> emails = new ArrayList<>();

    @Override
    public void guardarToDo(ToDo todo) { tareas.add(todo); }

    @Override
    public ToDo encontrarToDo(String nombre) {
        return tareas.stream()
                     .filter(t -> t.getNombre().equals(nombre))
                     .findFirst().orElse(null);
    }

    @Override
    public void marcarCompletado(String nombre) {
        tareas.stream()
              .filter(t -> t.getNombre().equals(nombre))
              .findFirst()
              .ifPresent(t -> t.setCompletado(true));
    }

    @Override
    public List<ToDo> obtenerPendientes() {
        return tareas.stream()
                     .filter(t -> !t.isCompletado())
                     .toList();
    }

    @Override
    public void guardarEmail(String email) { emails.add(email); }

    @Override
    public List<String> obtenerEmails() { return emails; }
}