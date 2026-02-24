package com.tt1.test;

import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import org.junit.jupiter.api.*;
import com.tt1.ToDo;

class ToDoTest {

    private ToDo todo;

    @BeforeAll
    static void setUpBeforeClass() throws Exception {}

    @AfterAll
    static void tearDownAfterClass() throws Exception {}

    @BeforeEach
    void setUp() throws Exception {
        todo = new ToDo();
    }

    @AfterEach
    void tearDown() throws Exception {
        todo = null;
    }

    @Test
    void testSetNombre() {
        todo.setNombre("Tarea 1");
        assertEquals("Tarea 1", todo.getNombre());
    }

    @Test
    void testCompletadoFalsePorDefecto() {
        assertFalse(todo.isCompletado());
    }

    @Test
    void testSetFechaLimite() {
        LocalDate fecha = LocalDate.of(2025, 12, 31);
        todo.setFechaLimite(fecha);
        assertEquals(fecha, todo.getFechaLimite());
    }
}