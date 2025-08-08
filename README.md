<h1 align="center">📝 spring-tasks-manager</h1>
<p align="center">
  <img src="https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen?logo=springboot&logoColor=white" />
  <img src="https://img.shields.io/badge/Java-17%2B-blue?logo=java" />
  <img src="https://img.shields.io/badge/Thymeleaf-3.x-005f0f?logo=thymeleaf" />
  <img src="https://img.shields.io/badge/Bootstrap-5.x-purple?logo=bootstrap" />
  <img src="https://img.shields.io/badge/H2-Database-lightgrey?logo=h2" />
</p>

<p align="center">
  <b>¡Organiza tus tareas de forma sencilla, rápida y elegante!</b><br>
  <i>Un gestor de tareas web hecho con Spring Boot, JPA, Thymeleaf y Bootstrap.</i>
</p>

---

## 🚀 Tecnologías Utilizadas

- <img src="https://img.shields.io/badge/Java-17%2B-blue?logo=java" height="18"/> **Java 17+**
- <img src="https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen?logo=springboot" height="18"/> **Spring Boot 3**
- <img src="https://img.shields.io/badge/Spring%20Data%20JPA-ORM-yellowgreen?logo=spring" height="18"/> **Spring Data JPA**
- <img src="https://img.shields.io/badge/H2-Database-lightgrey?logo=h2" height="18"/> **H2 Database** (en memoria)
- <img src="https://img.shields.io/badge/Thymeleaf-3.x-005f0f?logo=thymeleaf" height="18"/> **Thymeleaf**
- <img src="https://img.shields.io/badge/Bootstrap-5.x-purple?logo=bootstrap" height="18"/> **Bootstrap 5**
- <img src="https://img.shields.io/badge/Maven-Build-orange?logo=apachemaven" height="18"/> **Maven**

---

## ✨ ¿Qué puedes hacer con spring-tasks-manager?

- 📋 **Crear** tareas con título, descripción y fecha límite.
- ✏️ **Editar** tareas existentes de forma sencilla.
- ✅ **Marcar** tareas como completadas o pendientes.
- 🗑️ **Eliminar** tareas que ya no necesitas.
- 🔎 **Visualizar** todas tus tareas en una interfaz moderna y responsiva.
- ⚡ **Validación** de formularios para evitar errores y mejorar la experiencia.

---

## 🧠 Lógica y Arquitectura

La aplicación sigue el patrón **MVC (Modelo-Vista-Controlador)** para separar responsabilidades y facilitar el mantenimiento:

- **Modelo (`Task.java`)**  
  Define la entidad Tarea con:  
  `id`, `title`, `description`, `dueDate`, `done`.

- **Repositorio (`TaskRepository.java`)**  
  Extiende JpaRepository para operaciones CRUD automáticas sobre la base de datos.

- **Servicio (`TaskService.java`)**  
  Contiene la lógica de negocio: crear, actualizar, eliminar y alternar el estado de las tareas.

- **Controlador (`TaskController.java`)**  
  Gestiona las rutas web, conecta la lógica con las vistas y recibe los formularios del usuario.

- **Vistas (`tasks.html`, `edit-task.html`)**  
  Formularios y tablas para mostrar y editar tareas, usando Thymeleaf para el binding de datos y Bootstrap para el diseño visual.

**Flujo típico de uso:**
1. El usuario accede a `/tasks` y ve la lista de tareas.
2. Puede crear, editar, marcar como completada o eliminar cualquier tarea.
3. Todos los cambios se reflejan en la base de datos H2 y en la interfaz al instante.

---

## 📁 Estructura del Proyecto

```
spring-tasks-manager/
 ├─ src/
 │   ├─ main/
 │   │   ├─ java/
 │   │   │   └─ com/
 │   │   │       └─ elsombras/
 │   │   │           └─ helloworld/
 │   │   │               ├─ HelloworldApplication.java
 │   │   │               ├─ HelloworldController.java
 │   │   │               ├─ controller/
 │   │   │               │   └─ TaskController.java
 │   │   │               ├─ model/
 │   │   │               │   └─ Task.java
 │   │   │               ├─ repository/
 │   │   │               │   └─ TaskRepository.java
 │   │   │               └─ service/
 │   │   │                   └─ TaskService.java
 │   │   └─ resources/
 │   │       ├─ application.properties
 │   │       └─ templates/
 │   │           ├─ edit-task.html
 │   │           └─ tasks.html
 │   └─ test/
 │       └─ java/
 │           └─ com/
 │               └─ elsombras/
 │                   └─ helloworld/
 │                       └─ HelloworldApplicationTests.java
 └─ README.md
```

---

## ⚙️ Instalación y Ejecución

1. **Clona el repositorio**
   ```bash
   git clone <[url-del-repositorio](https://github.com/Uruena2603/spring-tasks-manager)>
   cd spring-tasks-manager
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

3. **Abre tu navegador en:**  
   [http://localhost:8080/tasks](http://localhost:8080/tasks)

4. **(Opcional) Accede a la consola H2:**  
   [http://localhost:8080/h2-console](http://localhost:8080/h2-console)  
   - JDBC URL: `jdbc:h2:mem:tasksdb`
   - Usuario: `sa`
   - Contraseña: _(dejar en blanco)_

---

## 🎨 Personalización

- Cambia la configuración de la base de datos en `src/main/resources/application.properties`.
- Modifica el diseño visual editando los archivos en `src/main/resources/templates/`.
- Puedes agregar nuevas funcionalidades extendiendo los controladores, servicios y vistas.

---

## 📝 Licencia

Este proyecto es solo para fines educativos y demostrativos.  
¡Siéntete libre de modificarlo y mejorarlo a tu gusto!

---

<p align="center">
  <b>¡Organiza tu vida, una tarea a la vez!
