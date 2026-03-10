package com.tt1;

import java.util.List;

/**
 * Interfaz que define las operaciones de la base de datos stub del sistema de tareas.
 * Establece el contrato que deben cumplir todas las implementaciones
 * de la capa de datos, permitiendo sustituirla fácilmente por mocks
 * o implementaciones reales en pruebas y producción.
 *
 * @author Clara
 * @version 1.0
 */
public interface IDBStub {

    /**
     * Añade una nueva tarea a la base de datos.
     * @param todo la tarea {@link ToDo} a añadir
     */
    void añadirToDo(ToDo todo);

    /**
     * Devuelve la lista completa de tareas almacenadas.
     * @return lista de todos los objetos {@link ToDo} almacenados
     */
    List<ToDo> obtenerTodos();

    /**
     * Marca como completada la tarea que coincida con el nombre indicado.
     * @param nombre el nombre de la tarea a marcar como completada
     */
    void marcarCompletado(String nombre);

    /**
     * Elimina la tarea que coincida con el nombre indicado.
     * @param nombre el nombre de la tarea a eliminar
     */
    void eliminarToDo(String nombre);

    /**
     * Añade una dirección de email a la base de datos.
     * @param email la dirección de correo electrónico a añadir
     */
    void añadirEmail(String email);

    /**
     * Devuelve la lista de emails registrados en la base de datos.
     * @return lista de direcciones de correo electrónico registradas
     */
    List<String> obtenerEmails();
}