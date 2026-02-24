package com.tt1.test;

import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import org.junit.jupiter.api.*;
import com.tt1.DBStub;
import com.tt1.MailerStub;
import com.tt1.Repositorio;
import com.tt1.Servicio;
import com.tt1.mock.FakeMailer;
import com.tt1.mock.FakeRepositorio;

class ServicioTest {

    private Servicio servicioFake;
    private Servicio servicioReal;
    private FakeRepositorio fakeRepo;
    private FakeMailer fakeMailer;

    @BeforeAll
    static void setUpBeforeClass() throws Exception {}

    @AfterAll
    static void tearDownAfterClass() throws Exception {}

    @BeforeEach
    void setUp() throws Exception {
        fakeRepo = new FakeRepositorio();
        fakeMailer = new FakeMailer();
        servicioFake = new Servicio(fakeRepo, fakeMailer);
        servicioReal = new Servicio(new Repositorio(new DBStub()), new MailerStub());
    }

    @AfterEach
    void tearDown() throws Exception {
        servicioFake = null;
        servicioReal = null;
    }

    @Test
    void testCrearToDo() {
        servicioFake.crearToDo("Tarea 1", LocalDate.of(2025, 12, 31));
        assertNotNull(fakeRepo.encontrarToDo("Tarea 1"));
    }

    @Test
    void testAgregarEmail() {
        servicioFake.agregarEmail("clara@test.com");
        assertEquals(1, fakeRepo.obtenerEmails().size());
    }

    @Test
    void testMarcarComoFinalizada() {
        servicioFake.crearToDo("Tarea 1", LocalDate.of(2025, 12, 31));
        servicioFake.marcarComoFinalizada("Tarea 1");
        assertEquals(0, servicioFake.listarPendientes().size());
    }

    @Test
    void testTareaVencidaEnviaCorreo() {
        servicioFake.agregarEmail("clara@test.com");
        servicioFake.crearToDo("Tarea vieja", LocalDate.of(2020, 1, 1));
        servicioFake.listarPendientes();
        assertTrue(fakeMailer.vecesLlamado > 0);
    }

    @Test
    void testIntegracionCrearToDo() {
        assertDoesNotThrow(() ->
            servicioReal.crearToDo("Tarea integración", LocalDate.of(2025, 12, 31))
        );
    }
}