# Gestor de Tareas - Spring Boot

Este proyecto es una aplicación web CRUD para la gestión de tareas, desarrollada con **Spring Boot**, **Spring Data JPA**, **Thymeleaf** y **Bootstrap**.

## Tecnologías Utilizadas

- **Java 17+**
- **Spring Boot 3**
- **Spring Data JPA**  
  Para la persistencia y operaciones CRUD sobre la base de datos.
- **H2 Database**  
  Base de datos en memoria para desarrollo y pruebas.
- **Thymeleaf**  
  Motor de plantillas para renderizar vistas HTML.
- **Bootstrap 5**  
  Framework CSS para diseño responsivo y moderno.
- **Maven**  
  Gestión de dependencias y ciclo de vida del proyecto.

## Lógica del Programa

La aplicación sigue el patrón **MVC (Modelo-Vista-Controlador)**:

- **Modelo (`Task.java`):**  
  Representa una tarea con los campos: id, título, descripción, fecha límite y estado (completada o no).

- **Repositorio (`TaskRepository.java`):**  
  Interfaz que extiende JpaRepository para acceder y manipular las tareas en la base de datos.

- **Servicio (`TaskService.java`):**  
  Contiene la lógica de negocio, como crear, actualizar, eliminar y alternar el estado de las tareas.

- **Controlador (`TaskController.java`):**  
  Expone rutas HTTP para listar, crear, editar, eliminar y marcar tareas.  
  Pasa los datos necesarios a las vistas y recibe los formularios del usuario.

- **Vistas (`tasks.html`, `edit-task.html`):**  
  Formularios y tablas para mostrar y editar tareas, usando Thymeleaf para el binding de datos y Bootstrap para el diseño.

**Flujo típico:**

1. El usuario accede a `/tasks` y ve la lista de tareas.
2. Puede crear una nueva tarea, editar una existente, marcarla como completada o eliminarla.
3. Todas las acciones se reflejan inmediatamente en la base de datos H2 y en la interfaz.

## Estructura del Proyecto

```
src/
 ├─ main/
 │   ├─ java/
 │   │   └─ com/
 │   │       └─ elsombras/
 │   │           └─ helloworld/
 │   │               ├─ HelloworldApplication.java
 │   │               ├─ HelloworldController.java
 │   │               ├─ controller/
 │   │               │   └─ TaskController.java
 │   │               ├─ model/
 │   │               │   └─ Task.java
 │   │               ├─ repository/
 │   │               │   └─ TaskRepository.java
 │   │               └─ service/
 │   │                   └─ TaskService.java
 │   └─ resources/
 │       ├─ application.properties
 │       └─ templates/
 │           ├─ edit-task.html
 │           └─ tasks.html
 └─ test/
     └─ java/
         └─ com/
             └─ elsombras/
                 └─ helloworld/
                     └─ HelloworldApplicationTests.java
```

## Instalación y Ejecución

1. **Clona el repositorio**

   ```bash
   git clone <url-del-repositorio>
   cd helloworld
   ```

2. **Ejecuta la aplicación**  
   En Windows:

   ```bash
   .\mvnw.cmd spring-boot:run
   ```

   En Linux/Mac:

   ```bash
   ./mvnw spring-boot:run
   ```

3. **Accede a la aplicación**  
   Abre tu navegador en: [http://localhost:8080/tasks](http://localhost:8080/tasks)

4. **Consola H2 (opcional)**  
   [http://localhost:8080/h2-console](http://localhost:8080/h2-console)
   - JDBC URL: `jdbc:h2:mem:tasksdb`
   - Usuario: `sa`
   - Contraseña: _(dejar en blanco)_

## Personalización

- Puedes modificar la configuración de la base de datos en `src/main/resources/application.properties`.
- Para cambiar el diseño, edita los archivos en `src/main/resources/templates/`.

## Licencia

Este proyecto es solo para fines educativos y demostrativos.
