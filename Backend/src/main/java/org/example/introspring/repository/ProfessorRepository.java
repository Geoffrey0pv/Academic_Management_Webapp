package org.example.introspring.repository;

import org.example.introspring.entity.Professor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProfessorRepository extends JpaRepository<Professor, Long>  {
    Optional<Professor> findById(Long id);
}
