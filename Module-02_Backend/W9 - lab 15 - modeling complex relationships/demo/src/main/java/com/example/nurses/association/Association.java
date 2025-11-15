package com.example.nurses.association;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "associations")
public class Association {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "association", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Chapter> chapters = new ArrayList<>();

    // getters/setters
    public Long getId() { return id; }
    public String getName() { return name; }
    public List<Chapter> getChapters() { return chapters; }
    public void setId(Long id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setChapters(List<Chapter> chapters) { this.chapters = chapters; }
}
