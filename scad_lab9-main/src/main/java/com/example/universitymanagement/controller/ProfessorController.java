package com.example.universitymanagement.controller;

import com.example.universitymanagement.entities.Professor;
import com.example.universitymanagement.service.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/professors")
public class ProfessorController {
    @Autowired
    private ProfessorService professorService;

    @PostMapping("/add")
    public Professor addProfessor(@RequestBody Professor professor) {
        return professorService.addProfessor(professor);
    }

    @GetMapping("/all")
    public List<Professor> getAllProfessors() {
        return professorService.getAllProfessors();
    }
}
