package com.example.events;

import jakarta.persistence.*;

@Entity
@Table(name = "speakers")
public class Speaker {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Integer presentationDurationMinutes;

    @ManyToOne(optional = false)
    @JoinColumn(name = "conference_id")
    private Conference conference;

    // getters/setters
    public Long getId() { return id; }
    public String getName() { return name; }
    public Integer getPresentationDurationMinutes() { return presentationDurationMinutes; }
    public Conference getConference() { return conference; }
    public void setId(Long id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setPresentationDurationMinutes(Integer minutes) { this.presentationDurationMinutes = minutes; }
    public void setConference(Conference conference) { this.conference = conference; }
}
