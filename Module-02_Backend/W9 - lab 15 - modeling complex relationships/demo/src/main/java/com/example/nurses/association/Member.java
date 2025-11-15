package com.example.nurses.association;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "members")
public class Member {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Enumerated(EnumType.STRING)
    private MemberStatus status;

    @Column(name = "renewal_date")
    private LocalDate renewalDate;

    @ManyToOne(optional = false)
    @JoinColumn(name = "chapter_id")
    private Chapter chapter;

    // getters/setters
    public Long getId() { return id; }
    public String getName() { return name; }
    public MemberStatus getStatus() { return status; }
    public LocalDate getRenewalDate() { return renewalDate; }
    public Chapter getChapter() { return chapter; }
    public void setId(Long id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setStatus(MemberStatus status) { this.status = status; }
    public void setRenewalDate(LocalDate renewalDate) { this.renewalDate = renewalDate; }
    public void setChapter(Chapter chapter) { this.chapter = chapter; }
}
