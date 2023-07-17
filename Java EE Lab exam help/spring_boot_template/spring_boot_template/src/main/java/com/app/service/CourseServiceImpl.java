package com.app.service;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dto.CourseDTO;
import com.app.entity.Course;
import com.app.exception.AyoooException;
import com.app.repository.CourseRepository;

@Service
@Transactional
public class CourseServiceImpl implements CourseService{

	@Autowired
	private CourseRepository courseRepo;
	
	@Autowired
	private ModelMapper mapper;
	

	@Override
	public String launchNowCourse(CourseDTO course) {

		Course persistentCourse = courseRepo.save(mapper.map(course, Course.class));
		
		return persistentCourse.getName() + "launched";
	}

	@Override
	public String updateCourseFees(Long id, int fees) {

		Course course = courseRepo.findById(id).orElseThrow(()-> new AyoooException("Invalid ID"));
		
		course.setFees(fees);
		
		return course.getName() + "fees changed";
	}

}
