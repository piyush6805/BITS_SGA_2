package com.example.demo.controller;

import com.example.demo.entity.Student;
import com.example.demo.entity.Course;
import com.example.demo.service.StudentService;
import com.example.demo.repository.CourseRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @Autowired
    private CourseRepository courseRepository;

    @GetMapping("/")
    public String viewHome(Model model) {
        model.addAttribute("students", studentService.getAllStudents());
        return "listStudents";
    }

    @GetMapping("/add")
    public String showForm(Model model) {
        model.addAttribute("student", new Student());
        model.addAttribute("courses", courseRepository.findAll());
        return "addStudent";
    }

    @PostMapping("/save")
    public String saveStudent(@ModelAttribute Student student) {
        try {
            studentService.saveStudent(student);
        } catch (Exception e) {
            System.out.println("Error saving student");
        }
        return "redirect:/";
    }

    @GetMapping("/edit/{id}")
    public String editStudent(@PathVariable Long id, Model model) {
        model.addAttribute("student", studentService.getStudentById(id));
        model.addAttribute("courses", courseRepository.findAll());
        return "updateStudent";
    }
}