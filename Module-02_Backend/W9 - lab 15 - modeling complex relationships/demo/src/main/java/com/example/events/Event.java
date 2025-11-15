package com.example.events;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "events")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "event_type")
public abstract class Event {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate date;
    private Integer durationMinutes;
    private String location;
    private String title;

    @OneToMany(mappedBy = "event", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Guest> guests = new ArrayList<>();

    // getters/setters
    public Long getId() { return id; }
    public LocalDate getDate() { return date; }
    public Integer getDurationMinutes() { return durationMinutes; }
    public String getLocation() { return location; }
    public String getTitle() { return title; }
    public List<Guest> getGuests() { return guests; }
    public void setId(Long id) { this.id = id; }
    public void setDate(LocalDate date) { this.date = date; }
    public void setDurationMinutes(Integer durationMinutes) { this.durationMinutes = durationMinutes; }
    public void setLocation(String location) { this.location = location; }
    public void setTitle(String title) { this.title = title; }
    public void setGuests(List<Guest> guests) { this.guests = guests; }
}
