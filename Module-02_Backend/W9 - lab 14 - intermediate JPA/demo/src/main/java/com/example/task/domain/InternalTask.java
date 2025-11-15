package com.example.task.domain;

import jakarta.persistence.*;

@Entity
@DiscriminatorValue("INTERNAL")
public class InternalTask extends Task {
    // sin campos adicionales
}