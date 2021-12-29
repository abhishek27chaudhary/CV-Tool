package com.cvtool.builder.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cvtool.builder.entity.Employee;
import com.cvtool.builder.repository.EmployeeRepo;
import com.cvtool.builder.util.CommonUtil;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepo empRepo;
	
	private CommonUtil util;
	
	public Employee saveEmployee(Employee employee) {
		
		return empRepo.save(employee);
	}
	
	public List<Employee> getEmployees(){
		return empRepo.findAll();
		
	}
	public Employee getEmployeeById(Long id){
		return empRepo.getById(id);
		
	}

}
