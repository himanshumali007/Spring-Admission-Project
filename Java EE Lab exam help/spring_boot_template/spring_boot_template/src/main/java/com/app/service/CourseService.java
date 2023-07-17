package com.app.service;

import com.app.dto.CourseDTO;
import com.app.entity.Course;

public interface CourseService {
	
	//Question 1
	String launchNowCourse(CourseDTO course);
	
	//Question 4
	String updateCourseFees(Long id, int fees);
	
}
