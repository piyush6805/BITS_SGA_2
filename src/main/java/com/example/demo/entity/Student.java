package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;

    public Student(Long id, String name, String email, Course course) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.course = course;
    }

    public Student() {}

    // getters and setters

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Course getCourse() {
        return course;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}