package com.example.universitymanagement.controller;

import com.example.universitymanagement.entities.Course;
import com.example.universitymanagement.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {
    @Autowired
    private CourseService courseService;

    @GetMapping("/professor/{id}")
    public List<Course> getCoursesByProfessor(@PathVariable Long id) {
        return courseService.getCoursesByProfessor(id);
    }
}
