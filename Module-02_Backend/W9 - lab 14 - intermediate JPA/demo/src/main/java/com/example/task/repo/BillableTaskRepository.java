package com.example.task.repo;

import com.example.task.domain.BillableTask;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;
import java.util.List;

public interface BillableTaskRepository extends JpaRepository<BillableTask, Long> {
    List<BillableTask> findByHourlyRateGreaterThan(BigDecimal minRate);
}