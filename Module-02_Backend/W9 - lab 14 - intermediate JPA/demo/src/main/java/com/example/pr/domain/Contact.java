package com.example.pr.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "contacts")
public class Contact {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    private Name name;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String company;

    // getters/setters
    public Long getId() { return id; }
    public Name getName() { return name; }
    public void setName(Name name) { this.name = name; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getCompany() { return company; }
    public void setCompany(String company) { this.company = company; }
}