package com.example.task.domain;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "tasks")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "task_type", discriminatorType = DiscriminatorType.STRING, length = 20)
public abstract class Task {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    private LocalDate dueDate;

    @Column(nullable = false)
    private boolean status = false; // false=pending, true=done

    // getters/setters
    public Long getId() { return id; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public LocalDate getDueDate() { return dueDate; }
    public void setDueDate(LocalDate dueDate) { this.dueDate = dueDate; }
    public boolean isStatus() { return status; }
    public void setStatus(boolean status) { this.status = status; }
}
