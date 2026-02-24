package com.tt1;

public class MailerStub implements IMailerStub {
	public boolean enviarCorreo(String direccion, String mensaje) {
	    System.out.println("Para: " + direccion);
	    System.out.println("Mensaje: " + mensaje);
	    return true;
	}
}