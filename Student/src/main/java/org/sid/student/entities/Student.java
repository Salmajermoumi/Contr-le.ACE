package org.sid.student.entities;


import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Utilisez IDENTITY pour auto-incrémenter l'ID
    private Long id;
    private String Name;
    private String email;
}
