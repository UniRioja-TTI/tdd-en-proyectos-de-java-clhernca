package com.tt1;

import java.time.LocalDate;

/**
 * Representa una tarea pendiente (ToDo) en el sistema de gestión de tareas.
 * Almacena el nombre, descripción, fecha límite y estado de completado de la tarea.
 *
 * @author Clara
 * @version 1.0
 */
public class ToDo {
    private String nombre;
    private String descripcion;
    private LocalDate fechaLimite;
    private boolean completado;

    /**
     * Constructor por defecto. Crea una tarea vacía sin inicializar.
     */
    public ToDo() {}

    /**
     * Obtiene el nombre identificativo de la tarea.
     * @return el nombre de la tarea
     */
    public String getNombre() { return nombre; }
    
    /**
     * Establece el nombre identificativo de la tarea.
     * @param nombre el nuevo nombre de la tarea
     */
    public void setNombre(String nombre) { this.nombre = nombre; }

    /**
     * Obtiene la descripción detallada de la tarea.
     * @return la descripción de la tarea
     */
    public String getDescripcion() { return descripcion; }

    /**
     * Establece la descripción detallada de la tarea.
     * @param descripcion la nueva descripción de la tarea
     */
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    /**
     * Obtiene la fecha límite para completar la tarea.
     * @return la fecha límite como {@link LocalDate}
     */
    public LocalDate getFechaLimite() { return fechaLimite; }

    /**
     * Establece la fecha límite para completar la tarea.
     * @param fechaLimite la nueva fecha límite como {@link LocalDate}
     */
    public void setFechaLimite(LocalDate fechaLimite) { this.fechaLimite = fechaLimite; }

    /**
     * Indica si la tarea ha sido completada.
     * @return {@code true} si la tarea está completada, {@code false} si está pendiente
     */
    public boolean isCompletado() { return completado; }

    /**
     * Establece el estado de completado de la tarea.
     * @param completado {@code true} para marcar la tarea como completada, {@code false} para marcarla como pendiente
     */
    public void setCompletado(boolean completado) { this.completado = completado; }
}