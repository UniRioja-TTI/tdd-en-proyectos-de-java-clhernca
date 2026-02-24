package com.tt1;

import java.util.List;

public interface IDBStub {
    void añadirToDo(ToDo todo);
    List<ToDo> obtenerTodos();
    void marcarCompletado(String nombre);
    void eliminarToDo(String nombre);
    void añadirEmail(String email);
    List<String> obtenerEmails();
}