
package com.vcube.studentportal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vcube.studentportal.model.Student;
import com.vcube.studentportal.repo.Studentrepo;

// Business Logic
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    Studentrepo studentRepo;

    // CREATE
    @Override
    public Student createStudent(Student s) {
        return studentRepo.save(s);
    }

    // READ ALL
    @Override
    public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }

    // READ BY ID
    @Override
    public Student getStudentByID(Integer sid) {
        return studentRepo.findById(sid).orElse(null);
    }

    // UPDATE
    @Override
    public Student updateStudent(Student student, Integer id) {

        // Find existing student
        Student existingStudent = studentRepo.findById(id)
                .orElseThrow(() ->
                    new RuntimeException("Student not found with ID: " + id));

        // Update student details
        existingStudent.setFname(student.getFname());
        existingStudent.setLname(student.getLname());
        existingStudent.setAge(student.getAge());
        existingStudent.setTotal_marks(student.getTotal_marks());

        // Save updated student
        return studentRepo.save(existingStudent);
    }

    // DELETE
    @Override
    public void deleteStudentById(Integer id) {
        studentRepo.deleteById(id);
    }

	

	
}
