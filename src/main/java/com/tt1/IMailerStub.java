package com.tt1;

/**
 * Interfaz que define las operaciones del servicio de envío de correos electrónicos.
 * Establece el contrato que deben cumplir todas las implementaciones
 * del mailer, permitiendo sustituirlo fácilmente por mocks o
 * implementaciones reales en pruebas y producción.
 *
 * @author Clara
 * @version 1.0
 */
public interface IMailerStub {

    /**
     * Envía un correo electrónico a la dirección indicada con el mensaje proporcionado.
     * @param direccion la dirección de correo electrónico destinataria
     * @param mensaje el contenido del mensaje a enviar
     * @return {@code true} si el envío fue exitoso, {@code false} en caso contrario
     */
    boolean enviarCorreo(String direccion, String mensaje);
}