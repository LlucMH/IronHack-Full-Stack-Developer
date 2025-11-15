package com.example.events;

import jakarta.persistence.*;

@Entity
@DiscriminatorValue("EXPOSITION")
public class Exposition extends Event {

}
