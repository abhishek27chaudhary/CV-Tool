package com.cvtool.builder.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Education {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long eduID;
	private String nameOfCollege;
	private String Degree;
	private String score;
	private Date completionDate;
	public String getNameOfCollege() {
		return nameOfCollege;
	}
	public void setNameOfCollege(String nameOfCollege) {
		this.nameOfCollege = nameOfCollege;
	}
	public String getDegree() {
		return Degree;
	}
	public void setDegree(String degree) {
		Degree = degree;
	}
	public String getScore() {
		return score;
	}
	public void setScore(String score) {
		this.score = score;
	}
	public Date getCompletionDate() {
		return completionDate;
	}
	public void setCompletionDate(Date completionDate) {
		this.completionDate = completionDate;
	}

}
