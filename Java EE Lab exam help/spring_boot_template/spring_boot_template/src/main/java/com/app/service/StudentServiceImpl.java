package com.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dto.StudentDTO;
import com.app.entity.Course;
import com.app.entity.Student;
import com.app.exception.AyoooException;
import com.app.repository.CourseRepository;
import com.app.repository.StudentRepository;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {
	
	
	@Autowired
	private CourseRepository courseRepo;
	
	@Autowired
	private StudentRepository studentRepo;
	
	@Autowired
	private ModelMapper mapper;

	@Override
	public String addNewStudent(StudentDTO student) {

		Course course = courseRepo.findByName(student.getCourseTitle()).orElseThrow(()-> new AyoooException("Invalid Course"));
		
		if(student.getScore() >= course.getMinScore()) {
			
			Student stud = mapper.map(student,Student.class);
			
			course.addStudent(stud);
			
			Student persistentStudent = studentRepo.save(stud);

			return persistentStudent.getFirstName() + " " + persistentStudent.getLastName() + " added to " + course; 
			
		}
		
		return "Less Score!!!!";
	}

	@Override
	public List<Student> viewAllStudents(String course) {

		
		return null;
	}

	@Override
	public String cancelStudentAdmission(Long studId, Long courseId) {
		// TODO Auto-generated method stub
		return null;
	}

}
