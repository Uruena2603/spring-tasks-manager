package com.elsombras.helloworld.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.elsombras.helloworld.model.Task;
import com.elsombras.helloworld.repository.TaskRepository;

@Service
public class TaskService {
    private final TaskRepository repo;

    public TaskService(TaskRepository repo) {
        this.repo = repo;
    }

    public List<Task> findAll() {
        return repo.findAll();
    }

    public Task findById(Long id) {
        return repo.findById(id)
                   .orElseThrow(() -> new RuntimeException("Task no encontrada: " + id));
    }

    public Task save(Task task) {
        return repo.save(task);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }

    // Actualizar tarea (solo campos editables)
    public Task updateTask(Long id, Task updated) {
        Task task = findById(id);
        task.setTitle(updated.getTitle());
        task.setDescription(updated.getDescription());
        task.setDueDate(updated.getDueDate());
        // No se actualiza 'done' aquí para evitar cambios accidentales
        return repo.save(task);
    }

    // Alternar estado de completado
    public Task toggleDone(Long id) {
        Task task = findById(id);
        task.setDone(!task.isDone());
        return repo.save(task);
    }
}
