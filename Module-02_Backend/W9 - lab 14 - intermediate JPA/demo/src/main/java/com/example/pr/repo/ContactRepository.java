package com.example.pr.repo;

import com.example.pr.domain.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ContactRepository extends JpaRepository<Contact, Long> {
    List<Contact> findByCompany(String company);
    List<Contact> findByNameLastNameIgnoreCase(String lastName);
    List<Contact> findByNameFirstNameContainingIgnoreCase(String fragment);
}