# 📚 Student Management System (Spring Boot)

A simple web-based application built using **Spring Boot** to manage students and their courses.
This project demonstrates CRUD operations, entity relationships, and a layered architecture using JPA.

---

## 🚀 Features

* Add new students
* View all students with their course details
* Update existing student information
* Display relational data using JOIN queries
* Simple and user-friendly JSP interface

---

## 🛠️ Tech Stack

* Java 17
* Spring Boot
* Spring Data JPA (Hibernate)
* MySQL
* JSP (Java Server Pages)
* Maven

---

## 🧱 Project Structure

```
src/main/java/com/example/demo
│
├── controller
├── service
├── repository
├── entity
└── DemoApplication.java

src/main/webapp/WEB-INF/jsp
```

---

## 🗄️ Database Setup

1. Create database:

```sql
CREATE DATABASE demo_db;
```

2. Update `application.properties`:

```
spring.datasource.url=jdbc:mysql://localhost:3306/demo_db
spring.datasource.username=root
spring.datasource.password=yourpassword
```

---

## ▶️ Running the Application

1. Clone the repository
2. Open in IntelliJ / any IDE
3. Run `DemoApplication.java`
4. Open browser:

```
http://localhost:8080/
```

---

## 🔗 Entity Relationship

* One **Course** → Many **Students**
* Implemented using:

  * `@ManyToOne`
  * `@OneToMany`

---

## 📊 Screenshots

* Student List Page
  <img width="1542" height="961" alt="image" src="https://github.com/user-attachments/assets/411ca1f5-5982-4144-8798-9daf88166fde" />


* Add Student Page
  <img width="709" height="534" alt="image" src="https://github.com/user-attachments/assets/44f6891d-bafb-4525-8776-baf0611fede5" />


* Update Student Page
  <img width="508" height="548" alt="image" src="https://github.com/user-attachments/assets/033598e1-6a7d-4680-8368-cd8702c796f6" />


* Database Tables
  
  Student Table
  <img width="1308" height="946" alt="image" src="https://github.com/user-attachments/assets/c6d03cee-16b2-4cb8-9868-1bef8fcb3705" />
  
  Course Table
  <img width="1082" height="685" alt="image" src="https://github.com/user-attachments/assets/4f0f810b-4c28-4d14-a73c-1451ad6415dd" />



---

## 🧪 Testing

* Basic unit testing using **JUnit**
* Repository and service layer tested

---

## ⚠️ Notes

* Initial course data is preloaded using `CommandLineRunner`
* Ensure MySQL is running before starting the application

---
