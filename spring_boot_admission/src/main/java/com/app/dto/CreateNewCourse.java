package com.app.dto;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


public class CreateNewCourse {	
	private String title;	
	private LocalDate startDate;	
	private LocalDate endDate;
	private double fees;	
	private double minScore;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
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
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	public double getMinScore() {
		return minScore;
	}
	public void setMinScore(double minScore) {
		this.minScore = minScore;
	}
	@Override
	public String toString() {
		return "CreateNewCourse [title=" + title + ", startDate=" + startDate + ", endDate=" + endDate + ", fees="
				+ fees + ", minScore=" + minScore + "]";
	}
	
	
	
}
