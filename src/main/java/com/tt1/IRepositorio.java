package com.tt1;

import java.util.List;

public interface IRepositorio {
    void guardarToDo(ToDo todo);
    ToDo encontrarToDo(String nombre);
    void marcarCompletado(String nombre);
    List<ToDo> obtenerPendientes();
    void guardarEmail(String email);
    List<String> obtenerEmails();
}