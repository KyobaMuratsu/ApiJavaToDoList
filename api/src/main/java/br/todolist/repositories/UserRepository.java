package br.todolist.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.todolist.entities.User;

public interface UserRepository extends JpaRepository<User, UUID> {
}
