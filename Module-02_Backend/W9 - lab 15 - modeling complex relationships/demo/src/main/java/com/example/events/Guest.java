package com.example.events;

import jakarta.persistence.*;

@Entity
@Table(name = "guests")
public class Guest {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Enumerated(EnumType.STRING)
    private GuestStatus status = GuestStatus.NO_RESPONSE;

    @ManyToOne(optional = false)
    @JoinColumn(name = "event_id")
    private Event event;

    // getters/setters
    public Long getId() { return id; }
    public String getName() { return name; }
    public GuestStatus getStatus() { return status; }
    public Event getEvent() { return event; }
    public void setId(Long id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setStatus(GuestStatus status) { this.status = status; }
    public void setEvent(Event event) { this.event = event; }
}
