package com.cvtool.builder.dto;

import com.cvtool.builder.entity.Employee;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CVDetailsDTO {
	@JsonIgnore
	private Employee emp;

	public Employee getEmpCVDetails() {
		return emp;
	}

	public void setEmpCVDetails(Employee emp) {
		this.emp = emp;
	}
	

}
