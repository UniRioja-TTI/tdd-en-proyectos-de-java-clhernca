package com.tt1.test;

import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import org.junit.jupiter.api.*;
import com.tt1.DBStub;
import com.tt1.Repositorio;
import com.tt1.ToDo;
import com.tt1.mock.FakeDBStub;

class RepositorioTest {

    private Repositorio repositorioFake;
    private Repositorio repositorioReal;
    private FakeDBStub fakeDB;
    private ToDo todo;

    @BeforeAll
    static void setUpBeforeClass() throws Exception {}

    @AfterAll
    static void tearDownAfterClass() throws Exception {}

    @BeforeEach
    void setUp() throws Exception {
        fakeDB = new FakeDBStub();
        repositorioFake = new Repositorio(fakeDB);
        repositorioReal = new Repositorio(new DBStub());
        todo = new ToDo();
        todo.setNombre("Tarea 1");
        todo.setFechaLimite(LocalDate.of(2025, 12, 31));
    }

    @AfterEach
    void tearDown() throws Exception {
        repositorioFake = null;
        repositorioReal = null;
        todo = null;
    }

    @Test
    void testGuardarYEncontrarToDo() {
        repositorioFake.guardarToDo(todo);
        assertNotNull(repositorioFake.encontrarToDo("Tarea 1"));
    }

    @Test
    void testObtenerPendientes() {
        repositorioFake.guardarToDo(todo);
        assertEquals(1, repositorioFake.obtenerPendientes().size());
    }

    @Test
    void testMarcarCompletado() {
        repositorioFake.guardarToDo(todo);
        repositorioFake.marcarCompletado("Tarea 1");
        assertTrue(repositorioFake.encontrarToDo("Tarea 1").isCompletado());
    }

    @Test
    void testIntegracionGuardarToDo() {
        repositorioReal.guardarToDo(todo);
        assertNotNull(repositorioReal.encontrarToDo("Tarea 1"));
    }
}