package com.app.service;

import java.util.List;

import com.app.dto.StudentDTO;
import com.app.entity.Student;

public interface StudentService {

	//Question 2
	String addNewStudent(StudentDTO student);
	
	//Question 3
	List<Student> viewAllStudents(String course);
	
	//Question 4 ufffff
	String cancelStudentAdmission(Long studId, Long courseId);
}

