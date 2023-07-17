package com.app.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Course extends BaseEntity{

	@Column(name = "Name",unique = true)
	private String name;
	
	@Column(name = "Start_Date")
	private LocalDate startDate;
	
	@Column(name = "End_Date")
	private LocalDate endDate;
	
	@Column(name = "Fees")
	private int fees;
	
	@Column(name = "Min_Score")
	private int minScore;
	
	@OneToMany(mappedBy = "course",cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Student> list = new ArrayList<Student>();
	
	

	public Course(String name, LocalDate startDate, LocalDate endDate, int fees, int minScore) {
		super();
		this.name = name;
		this.startDate = startDate;
		this.endDate = endDate;
		this.fees = fees;
		this.minScore = minScore;
		
	}

	public Course() {
		
		super();
		System.out.println("Def cnstr of Course");
	}

	//Gavin King's Helper Methods
	public void addStudent(Student student) {
		list.add(student);
		student.setCouse(this);
	}
	
	public void removeStudent(Student student) {
		list.remove(student);
		student.setCouse(null);
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public int getFees() {
		return fees;
	}

	public void setFees(int fees) {
		this.fees = fees;
	}

	public int getMinScore() {
		return minScore;
	}

	public void setMinScore(int minScore) {
		this.minScore = minScore;
	}

	public List<Student> getList() {
		return list;
	}

	public void setList(List<Student> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "Course [name=" + name + ", startDate=" + startDate + ", endDate=" + endDate + ", fees=" + fees
				+ ", minScore=" + minScore +", getId()=" + getId() + "]";
	}
	
	
	
}
