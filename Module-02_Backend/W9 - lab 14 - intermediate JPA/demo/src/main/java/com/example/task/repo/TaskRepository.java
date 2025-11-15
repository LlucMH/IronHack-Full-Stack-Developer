package com.example.task.repo;

import com.example.task.domain.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findByStatus(boolean status);
    List<Task> findByDueDateBeforeAndStatus(LocalDate dueDate, boolean status);

    // ejemplo JPQL por subtipo
    @Query("select t from Task t where type(t) = com.example.tasks.domain.BillableTask")
    List<Task> findAllBillable();
}