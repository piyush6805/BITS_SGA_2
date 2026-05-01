package com.example.demo.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String courseName;

    @OneToMany(mappedBy = "course")
    private List<Student> students;

    public Course(Long id, String courseName, List<Student> students) {
        this.id = id;
        this.courseName = courseName;
        this.students = students;
    }

    public Course() {}

    // getters and setters

    public Long getId() {
        return id;
    }

    public String getCourseName() {
        return courseName;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}