package com.elsombras.helloworld.controller;

import com.elsombras.helloworld.service.TaskService;
import com.elsombras.helloworld.model.Task;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/tasks")
public class TaskController {
    private final TaskService service;

    public TaskController(TaskService service) {
        this.service = service;
    }

    @GetMapping
    public String getAll(Model model) {
        model.addAttribute("tasks", service.findAll());
        return "tasks";
    }


    // Mostrar formulario de edición
    @GetMapping("/edit/{id}")
    public String editForm(@PathVariable Long id, Model model) {
        Task task = service.findById(id);
        model.addAttribute("task", task);
        return "edit-task";
    }

    @PostMapping
    public String create(Task task, RedirectAttributes redirectAttributes) {
        service.save(task);
        redirectAttributes.addFlashAttribute("success", "Tarea creada correctamente");
        return "redirect:/tasks";
    }


    // Procesar edición de tarea
    @PostMapping("/edit/{id}")
    public String update(@PathVariable Long id, Task task, RedirectAttributes redirectAttributes) {
        service.updateTask(id, task);
        redirectAttributes.addFlashAttribute("success", "Tarea actualizada correctamente");
        return "redirect:/tasks";
    }

    // Alternar estado de completado
    @GetMapping("/toggle/{id}")
    public String toggleDone(@PathVariable Long id, RedirectAttributes redirectAttributes) {
        service.toggleDone(id);
        redirectAttributes.addFlashAttribute("success", "Estado de tarea actualizado");
        return "redirect:/tasks";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id, RedirectAttributes redirectAttributes) {
        service.delete(id);
        redirectAttributes.addFlashAttribute("success", "Tarea eliminada correctamente");
        return "redirect:/tasks";
    }

    // El método getAll ya retorna la vista tasks
}
