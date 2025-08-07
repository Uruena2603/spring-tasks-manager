package com.elsombras.helloworld.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.elsombras.helloworld.model.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
