package com.tt1;

import java.util.List;

/**
 * Interfaz que define las operaciones del repositorio de tareas y emails.
 * Establece el contrato que deben cumplir todas las implementaciones
 * del repositorio, permitiendo desacoplar el servicio de la capa de datos.
 *
 * @author Clara
 * @version 1.0
 */
public interface IRepositorio {

    /**
     * Guarda una nueva tarea en el repositorio.
     * @param todo la tarea {@link ToDo} a guardar
     */
    void guardarToDo(ToDo todo);

    /**
     * Busca y devuelve una tarea por su nombre.
     * @param nombre el nombre de la tarea a buscar
     * @return la tarea {@link ToDo} correspondiente, o {@code null} si no existe
     */
    ToDo encontrarToDo(String nombre);

    /**
     * Marca como completada la tarea con el nombre indicado.
     * @param nombre el nombre de la tarea a marcar como completada
     */
    void marcarCompletado(String nombre);

    /**
     * Obtiene la lista de tareas que aún no han sido completadas.
     * @return lista de objetos {@link ToDo} con estado pendiente
     */
    List<ToDo> obtenerPendientes();

    /**
     * Guarda una dirección de email para recibir notificaciones.
     * @param email la dirección de correo electrónico a guardar
     */
    void guardarEmail(String email);

    /**
     * Obtiene la lista de emails registrados en el repositorio.
     * @return lista de direcciones de correo electrónico registradas
     */
    List<String> obtenerEmails();
}