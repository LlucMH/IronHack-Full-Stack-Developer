package com.example.task.domain;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@DiscriminatorValue("BILLABLE")
public class BillableTask extends Task {

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal hourlyRate;

    public BigDecimal getHourlyRate() { return hourlyRate; }
    public void setHourlyRate(BigDecimal hourlyRate) { this.hourlyRate = hourlyRate; }
}