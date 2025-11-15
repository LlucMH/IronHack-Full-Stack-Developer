package com.example.nurses.association;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "chapters")
public class Chapter {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String district;

    @ManyToOne(optional = false)
    @JoinColumn(name = "association_id")
    private Association association;

    @OneToMany(mappedBy = "chapter", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Member> members = new ArrayList<>();

    @OneToOne
    @JoinColumn(name = "president_id", unique = true)
    private Member president;

    // getters/setters
    public Long getId() { return id; }
    public String getName() { return name; }
    public String getDistrict() { return district; }
    public Association getAssociation() { return association; }
    public List<Member> getMembers() { return members; }
    public Member getPresident() { return president; }
    public void setId(Long id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setDistrict(String district) { this.district = district; }
    public void setAssociation(Association association) { this.association = association; }
    public void setMembers(List<Member> members) { this.members = members; }
    public void setPresident(Member president) { this.president = president; }
}
