package com.tt1.mock;

import com.tt1.IMailerStub;

public class FakeMailer implements IMailerStub {
    public String ultimaDireccion;
    public String ultimoMensaje;
    public int vecesLlamado = 0;

    @Override
    public boolean enviarCorreo(String direccion, String mensaje) {
        ultimaDireccion = direccion;
        ultimoMensaje = mensaje;
        vecesLlamado++;
        return true;
    }
}