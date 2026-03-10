package com.tt1;

import java.util.ArrayList;
import java.util.List;

/**
 * Implementación stub de la base de datos para el sistema de tareas.
 * Simula el comportamiento de una base de datos real utilizando listas
 * en memoria, sin persistencia de datos entre ejecuciones.
 * Implementa la interfaz {@link IDBStub}.
 *
 * @author Clara
 * @version 1.0
 */
public class DBStub implements IDBStub {
    private List<ToDo> tareas = new ArrayList<>();
    private List<String> emails = new ArrayList<>();

    /**
     * Añade una nueva tarea a la base de datos en memoria.
     * @param todo la tarea {@link ToDo} a añadir
     */
    public void añadirToDo(ToDo todo) {
        tareas.add(todo);
    }

    /**
     * Devuelve la lista completa de tareas almacenadas.
     * @return lista de todos los objetos {@link ToDo} almacenados
     */
    public List<ToDo> obtenerTodos() {
        return tareas;
    }

    /**
     * Marca como completada la tarea que coincida con el nombre indicado.
     * Si no existe ninguna tarea con ese nombre, no realiza ninguna acción.
     * @param nombre el nombre de la tarea a marcar como completada
     */
    public void marcarCompletado(String nombre) {
        for (ToDo t : tareas) {
            if (t.getNombre().equals(nombre)) {
                t.setCompletado(true);
            }
        }
    }

    /**
     * Elimina de la base de datos la primera tarea que coincida con el nombre indicado.
     * Si no existe ninguna tarea con ese nombre, no realiza ninguna acción.
     * @param nombre el nombre de la tarea a eliminar
     */
    public void eliminarToDo(String nombre) {
        for (int i = 0; i < tareas.size(); i++) {
            if (tareas.get(i).getNombre().equals(nombre)) {
                tareas.remove(i);
                break;
            }
        }
    }

    /**
     * Añade una dirección de email a la lista de emails registrados.
     * @param email la dirección de correo electrónico a añadir
     */
    public void añadirEmail(String email) {
        emails.add(email);
    }

    /**
     * Devuelve la lista de emails registrados en la base de datos.
     * @return lista de direcciones de correo electrónico registradas
     */
    public List<String> obtenerEmails() {
        return emails;
    }
}