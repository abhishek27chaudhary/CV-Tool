package com.cvtool.builder;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cvtool.builder.entity.Employee;
import com.cvtool.builder.service.EmployeeService;

@SpringBootTest
class CVtoolApplicationTests {
	@Autowired
	private EmployeeService service;
	@Test
	void contextLoads() {
	}
	
	@Test
	void updateCVTest() {
		Employee emp = new Employee();
		emp.setAchievement("y");
		emp.setContact("");
		service.saveEmployee(emp);
	}

}
