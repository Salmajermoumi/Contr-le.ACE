package org.sid.student.repositories;

import org.sid.student.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {
    List<Student> findByName(String Name);

    // Trouver les étudiants par prénom et âge
    List<Student> findByNameAndemaiAndEmailAndEmail(String Name, int email);

    // Trouver les étudiants avec un âge supérieur à une valeur donnée
    List<Student> findByEmailGreaterThan(int email);

}
