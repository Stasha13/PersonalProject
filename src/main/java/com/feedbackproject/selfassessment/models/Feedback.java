package com.feedbackproject.selfassessment.models;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Feedback {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String name;
	
//	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MM-dd-yyyy")
//	private Date dateCompleted;
	private String solveProblem;
	private String explainConcept;
	private String presentIdeas;
	private String timeManagement;
	private String strengths;
	private String weaknesses;
	private String improvements;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	} 
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

//	public Date getDateCompleted() {
//		return dateCompleted;
//	}
//	
//	public void setDateCompleted(Date dateCompleted) {
//		this.dateCompleted = dateCompleted;
//	}
	
	public String getSolveProblem() {
		return solveProblem;
	}
	
	public void setSolveProblem(String solveProblem) {
		this.solveProblem = solveProblem;
	}
	
	public String getExplainConcept() {
		return explainConcept;
	}
	
	public void setExplainConcept(String explainConcept) {
		this.explainConcept = explainConcept;
	}
	
	public String getPresentIdeas() {
		return presentIdeas;
	}
	
	public void setPresentIdeas(String presentIdeas) {
		this.presentIdeas = presentIdeas;
	}
	
	public String getTimeManagement() {
		return timeManagement;
	}
	
	public void setTimeManagement(String timeManagement) {
		this.timeManagement = timeManagement;
	}
	
	public String getStrengths() {
		return strengths;
	}
	
	public void setStrengths(String strengths) {
		this.strengths = strengths;
	}
	
	public String getWeaknesses() {
		return weaknesses;
	}
	
	public void setWeaknesses(String weaknesses) {
		this.weaknesses = weaknesses;
	}
	
	public String getImprovements() {
		return improvements;
	}
	
	public void setImprovements(String improvements) {
		this.improvements = improvements;
	}	
	
}
