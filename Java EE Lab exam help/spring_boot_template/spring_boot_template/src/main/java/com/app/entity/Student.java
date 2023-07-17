package com.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Student extends BaseEntity{

	@Column(name = "First_Name")
	private String firstName;
	
	@Column(name = "Lase_Name")
	private String lastName;
	
	@Column(name = "Email",unique = true)
	private String email;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Course_ID")
	private Course course;
	
	@Column(name = "Score")
	private int score;
	
	

	public Student() {
		super();
		System.out.println("Def cnstr of Student");
	}

	public Student(String firstName, String lastName, String email, int score) {
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

	public Course getCouse() {
		return course;
	}

	public void setCouse(Course couse) {
		this.course = couse;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", couse=" + course.getName()
				+ ", score=" + score + ", getId()=" + getId() + "]";
	}
	
	

}
