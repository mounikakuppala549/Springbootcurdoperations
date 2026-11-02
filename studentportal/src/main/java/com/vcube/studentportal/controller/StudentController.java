
package com.vcube.studentportal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vcube.studentportal.model.Student;
import com.vcube.studentportal.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    // WELCOME
    @GetMapping("/wel")
    String welcome() {
        return "Welcome to Spring Boot";
    }

    // READ ALL
    @GetMapping("/getAllStudents")
    List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    // CREATE
    @PostMapping("/add")
    Student createStudent(@RequestBody Student s) {
        return studentService.createStudent(s);
    }

    // READ BY ID
    @GetMapping("/getStudent/{id}")
    Student getStudentByID(@PathVariable Integer id) {
        return studentService.getStudentByID(id);
    }

    // UPDATE
    @PutMapping("/{id}")
    public Student updateStudent(
            @PathVariable Integer id,
            @RequestBody Student student) {

        return studentService.updateStudent(student, id);
    }

    // DELETE
    @DeleteMapping("/delete/{id}")
    String deleteStudentById(@PathVariable Integer id) {

        studentService.deleteStudentById(id);

        return "Student deleted successfully with ID: " + id;
    }
}
