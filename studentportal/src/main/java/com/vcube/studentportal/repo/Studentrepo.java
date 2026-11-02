package com.vcube.studentportal.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.vcube.studentportal.model.Student;

@Repository
public interface Studentrepo extends JpaRepository<Student, Integer> {
	
	}

