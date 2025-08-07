# Spring Tasks Manager 🚀

¡Bienvenido a **Spring Tasks Manager**!  
Una aplicación web moderna para gestionar tus tareas, construida con **Spring Boot**, **Thymeleaf** y **Bootstrap 5**.

---

## ✨ Características

- 📝 Crea, edita y elimina tareas fácilmente.
- ✅ Marca tareas como completadas o pendientes con un solo clic.
- 📅 Visualiza fechas límite de forma clara.
- 💎 Interfaz elegante, responsiva y profesional.
- ⚡️ Basada en microservicios y buenas prácticas Java.

---

## 🧠 Lógica del programa

La aplicación sigue una arquitectura MVC (Modelo-Vista-Controlador):

- **Modelo:** La entidad `Task` representa cada tarea, con campos como título, descripción, fecha límite y estado (completada o pendiente).
- **Repositorio:** `TaskRepository` extiende `JpaRepository` para acceder y manipular las tareas en la base de datos H2 en memoria.
- **Servicio:** `TaskService` contiene la lógica de negocio para crear, actualizar, eliminar y alternar el estado de las tareas.
- **Controlador:** `TaskController` gestiona las rutas web, conecta la lógica de negocio con las vistas y responde a las acciones del usuario.
- **Vistas:** Las páginas HTML usan Thymeleaf y Bootstrap para mostrar la lista de tareas, formularios y botones de acción de forma moderna y responsiva.

---

## 🚀 Instalación y ejecución

1. **Clona el repositorio**
   ```bash
   git clone https://github.com/tuusuario/spring-tasks-manager.git
   cd spring-tasks-manager
   ```

2. **Ejecuta la aplicación**
   ```bash
   ./mvnw spring-boot:run
   ```
   o en Windows:
   ```cmd
   .\mvnw.cmd spring-boot:run
   ```

3. **Abre tu navegador**
   ```
   http://localhost:8080/tasks
   ```

---

## 🛠️ Tecnologías usadas

- Java 17+
- Spring Boot 3
- Spring Data JPA (H2 Database)
- Thymeleaf
- Bootstrap 5 + Bootstrap Icons

---

## 📂 Estructura del proyecto

```
src/
 └── main/
     ├── java/
     │   └── com/elsombras/helloworld/
     │       ├── controller/
     │       ├── model/
     │       ├── repository/
     │       └── service/
     └── resources/
         ├── templates/
         └── application.properties
```
---

**¡Disfruta organizando tus tareas
