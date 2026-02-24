# Taller Transversal I — Práctica 3

**Autora:** Clara Hernández Calleja

## Descripción
Proyecto de prácticas para explorar la estructura de un proyecto Java con Maven y JUnit,
y aplicar los principios de TDD (Test Driven Development) mediante un servicio de tareas pendientes.

## Requisitos
- Java 21
- Maven 3.8+

## Cómo compilar
mvn compile

## Cómo ejecutar los tests
mvn test

## Estructura del proyecto
- `src/main/java/com/tt1` - Código fuente principal
  - `ToDo.java` - JavaBean que representa una tarea
  - `DBStub.java` - Simulación de base de datos en memoria
  - `Repositorio.java` - Capa de acceso a datos
  - `MailerStub.java` - Simulación de servicio de correo
  - `Servicio.java` - Lógica de negocio y operaciones del usuario
- `src/test/java/com/tt1/test` - Tests unitarios y de integración
- `src/test/java/com/tt1/mock` - Clases fake para tests unitarios
- `src/main/resources` - Configuración de la aplicación