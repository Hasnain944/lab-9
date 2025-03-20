package com.example.universitymanagement.repository;

import com.example.universitymanagement.entities.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {}
