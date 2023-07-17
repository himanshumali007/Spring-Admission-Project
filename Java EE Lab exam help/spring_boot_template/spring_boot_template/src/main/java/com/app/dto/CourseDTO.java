package com.app.dto;

import java.time.LocalDate;

public class CourseDTO {

	private String name;
	
	private LocalDate startDate;
	
	private LocalDate endDate;
	
	private int fees;
	
	private int minScore;

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

	@Override
	public String toString() {
		return "CourseDTO [name=" + name + ", startDate=" + startDate + ", endDate=" + endDate + ", fees=" + fees
				+ ", minScore=" + minScore + "]";
	}
	
	
}
