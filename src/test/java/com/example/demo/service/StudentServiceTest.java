package com.example.demo.service;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class StudentServiceTest {

    @Autowired
    private StudentService service;

    @Test
    void testSaveStudent() {
        Student s = new Student();
        s.setName("Test");
        s.setEmail("test@mail.com");

        service.saveStudent(s);

        assertNotNull(s.getId());
    }
}
