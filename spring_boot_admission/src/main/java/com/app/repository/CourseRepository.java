package com.app.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.controller.entities.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

	Optional<Course> findByTitle(String courseTitle);

	//Use below approach for bulk update , here we are updating fees of a single course!
	//check the code in service layer
//	@Modifying
//	@Query("update Course c  set c.fees=?1 where c.id=?2")
//	int updateFees(double updatedFees, Long id);

}
