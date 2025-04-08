package org.example.introspring.repository;

import org.example.introspring.entity.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> { // Cambiado a Long
    List<Student> findByProgram(String program);
    Student getStudentById(long id);
    List<Student> findAll();
}
