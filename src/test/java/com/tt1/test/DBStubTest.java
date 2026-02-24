package com.tt1.test;

import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import org.junit.jupiter.api.*;
import com.tt1.DBStub;
import com.tt1.ToDo;

class DBStubTest {

    private DBStub db;
    private ToDo todo;

    @BeforeAll
    static void setUpBeforeClass() throws Exception {}

    @AfterAll
    static void tearDownAfterClass() throws Exception {}

    @BeforeEach
    void setUp() throws Exception {
        db = new DBStub();
        todo = new ToDo();
        todo.setNombre("Tarea 1");
        todo.setFechaLimite(LocalDate.of(2025, 12, 31));
    }

    @AfterEach
    void tearDown() throws Exception {
        db = null;
        todo = null;
    }

    @Test
    void testAñadirYObtenerToDo() {
        db.añadirToDo(todo);
        assertEquals(1, db.obtenerTodos().size());
    }

    @Test
    void testMarcarCompletado() {
        db.añadirToDo(todo);
        db.marcarCompletado("Tarea 1");
        assertTrue(db.obtenerTodos().get(0).isCompletado());
    }

    @Test
    void testAñadirEmail() {
        db.añadirEmail("clara@test.com");
        assertEquals(1, db.obtenerEmails().size());
    }

    @Test
    void testEliminarToDo() {
        db.añadirToDo(todo);
        db.eliminarToDo("Tarea 1");
        assertEquals(0, db.obtenerTodos().size());
    }
}