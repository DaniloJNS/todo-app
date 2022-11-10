package com.todoapp.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class TaskList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public TaskList (Long id, String name) {
        this.id = id;
        this.name = name;
    };

    public TaskList(Long id) {
        this.id = id;
    }
}
