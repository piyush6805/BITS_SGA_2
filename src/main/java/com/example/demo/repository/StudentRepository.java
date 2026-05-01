package com.example.demo.repository;

import com.example.demo.entity.Student;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    @Query("SELECT s FROM Student s LEFT JOIN s.course c")
    List<Student> findStudentsWithCourses();
}