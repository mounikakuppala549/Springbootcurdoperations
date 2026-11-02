package com.vcube.studentportal.service;

import java.util.List;

import com.vcube.studentportal.model.Student;
 
//what to do
public interface StudentService {
	  public  Student createStudent(Student s);
     
	  List<Student> getAllStudents();
	  
	  Student getStudentByID(Integer sid);
	  
      Student updateStudent(Student student, Integer id);

	   void deleteStudentById(Integer id);
	  
}
