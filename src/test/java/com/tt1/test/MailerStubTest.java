package com.tt1.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import com.tt1.MailerStub;

class MailerStubTest {

    private MailerStub mailer;

    @BeforeAll
    static void setUpBeforeClass() throws Exception {}

    @AfterAll
    static void tearDownAfterClass() throws Exception {}

    @BeforeEach
    void setUp() throws Exception {
        mailer = new MailerStub();
    }

    @AfterEach
    void tearDown() throws Exception {
        mailer = null;
    }

    @Test
    void testEnviarCorreoDevuelveTrue() {
        boolean resultado = mailer.enviarCorreo("test@test.com", "Hola");
        assertTrue(resultado);
    }
}