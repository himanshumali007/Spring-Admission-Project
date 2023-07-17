package com.app.controller.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Entity
@Table(name="students")
public class Student extends BaseEntity {
	
	@Column(length=30)
	private String firstName;
	@Column(length=30)
	private String lastName;
	@Column(unique = true, length=30)
	private String email;
	private double score;
	
	@ManyToOne(fetch =FetchType.LAZY )
	@JoinColumn(name="course_id")
	private Course enrolledCourse;
	
	public Student(String firstName, String lastName, String email, double score) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.score = score;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public Course getEnrolledCourse() {
		return enrolledCourse;
	}

	public void setEnrolledCourse(Course enrolledCourse) {
		this.enrolledCourse = enrolledCourse;
	}

	public Student() {
		super();
	}

	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", score=" + score
				+ ", enrolledCourse=" + enrolledCourse.getTitle() + "]" + " ID: " + getId();
	} 
	
	
	
}
