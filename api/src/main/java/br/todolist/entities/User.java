package br.todolist.entities;

import java.util.List;
import java.util.UUID;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID userUuid;

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Task> tasks;

    private String name;

    public User() {
    }

    public User(UUID userUuid, List<Task> tasks, String name) {
        this.userUuid = userUuid;
        this.tasks = tasks;
        this.name = name;
    }

    public UUID getUserUuid() {
        return userUuid;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    
}
