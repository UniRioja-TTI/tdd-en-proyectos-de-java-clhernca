package com.tt1;

/**
 * Implementación stub del servicio de envío de correos electrónicos.
 * Simula el envío de correos imprimiendo por consola el destinatario
 * y el mensaje, sin realizar ningún envío real.
 * Implementa la interfaz {@link IMailerStub}.
 *
 * @author Clara
 * @version 1.0
 */
public class MailerStub implements IMailerStub {

    /**
     * Simula el envío de un correo electrónico imprimiendo por consola
     * la dirección destinataria y el mensaje.
     * @param direccion la dirección de correo electrónico destinataria
     * @param mensaje el contenido del mensaje a enviar
     * @return {@code true} siempre, indicando que el envío fue exitoso
     */
    public boolean enviarCorreo(String direccion, String mensaje) {
        System.out.println("Para: " + direccion);
        System.out.println("Mensaje: " + mensaje);
        return true;
    }
}