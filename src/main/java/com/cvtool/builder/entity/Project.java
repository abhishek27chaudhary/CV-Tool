package com.cvtool.builder.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Project {
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO )
	private Long projectID;
	private String clientName;
	private String designation;
//	private String description;
//	private String responsibility;
//	private Date fromDate;
//	private Date toDate;
//	
	public Long getProjectID() {
		return projectID;
	}
	
	public void setProjectID(Long projectID) {
		this.projectID = projectID;
	}
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	
//	@ManyToOne
//    private Employee employee;
//	
//	public String getClientName() {
//		return clientName;
//	}
//	public void setClientName(String clientName) {
//		this.clientName = clientName;
//	}
//	public String getDesignation() {
//		return designation;
//	}
//	public void setDesignation(String designation) {
//		this.designation = designation;
//	}
//	public String getDescription() {
//		return description;
//	}
//	public void setDescription(String description) {
//		this.description = description;
//	}
//	public String getResponsibility() {
//		return responsibility;
//	}
//	public void setResponsibility(String responsibility) {
//		this.responsibility = responsibility;
//	}
//	public Date getFromDate() {
//		return fromDate;
//	}
//	public void setFromDate(Date fromDate) {
//		this.fromDate = fromDate;
//	}
//	public Date getToDate() {
//		return toDate;
//	}
//	public void setToDate(Date toDate) {
//		this.toDate = toDate;
//	}
	
}
