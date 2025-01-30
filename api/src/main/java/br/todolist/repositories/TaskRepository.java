package br.todolist.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.todolist.entities.Task;

public interface TaskRepository extends JpaRepository<Task, UUID> {
}
