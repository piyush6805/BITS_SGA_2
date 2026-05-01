package com.example.demo;

import com.example.demo.entity.Course;
import com.example.demo.entity.Student;
import com.example.demo.repository.CourseRepository;
import com.example.demo.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataLoader {

    @Bean
    CommandLineRunner loadData(CourseRepository courseRepository, StudentRepository studentRepository) {
        return args -> {

            // Insert courses
            if (courseRepository.findByCourseName("Mathematics").isEmpty())
                courseRepository.save(new Course(null, "Mathematics", null));

            if (courseRepository.findByCourseName("Physics").isEmpty())
                courseRepository.save(new Course(null, "Physics", null));

            if (courseRepository.findByCourseName("Computer Science").isEmpty())
                courseRepository.save(new Course(null, "Computer Science", null));

            if (courseRepository.findByCourseName("Biology").isEmpty())
                courseRepository.save(new Course(null, "Biology", null));

            if (courseRepository.findByCourseName("Chemistry").isEmpty())
                courseRepository.save(new Course(null, "Chemistry", null));

            // Insert students
            if (studentRepository.count() < 10) {
                Course c1 = courseRepository.findAll().get(0);
                Course c2 = courseRepository.findAll().get(1);

                studentRepository.save(new Student(null, "Rahul", "rahul@gmail.com", c1));
                studentRepository.save(new Student(null, "Anita", "anita@gmail.com", c2));
                studentRepository.save(new Student(null, "Karan", "karan@gmail.com", c1));
                studentRepository.save(new Student(null, "Sneha", "sneha@gmail.com", c2));
                studentRepository.save(new Student(null, "Arjun", "arjun@gmail.com", c1));
                studentRepository.save(new Student(null, "Meera", "meera@gmail.com", c2));
                studentRepository.save(new Student(null, "Ravi", "ravi@gmail.com", c1));
                studentRepository.save(new Student(null, "Priya", "priya@gmail.com", c2));
                studentRepository.save(new Student(null, "Amit", "amit@gmail.com", c1));
                studentRepository.save(new Student(null, "Neha", "neha@gmail.com", c2));
            }
        };
    }
}