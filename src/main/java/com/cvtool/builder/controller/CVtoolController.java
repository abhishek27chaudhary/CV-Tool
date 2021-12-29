package com.cvtool.builder.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cvtool.builder.dto.CVDetailsDTO;
import com.cvtool.builder.entity.Employee;
import com.cvtool.builder.repository.EmployeeRepo;
import com.cvtool.builder.service.EmployeeService;

@RestController
public class CVtoolController {
	
@Autowired
private EmployeeService service;	

@PostMapping("/updateCV")
public Employee addEmployee(@RequestBody Employee emp) {
	return service.saveEmployee(emp);
}

@GetMapping("/getCVInfo/{emailId}")
public List<Employee> findAllEmployee(){
	return service.getEmployees();
}
	
	
	
	
	
	
//-----------------	
//	
//	@Autowired
//	private EmployeeRepo empRepo;
//
//	@GetMapping("/getCvDetails")
//	public List<Employee> getCvDetails() {
//		return empRepo.findAll();
//	}
//	
//	
////	 @PostMapping(value = "/updateCv")
//	@RequestMapping(value = "/updateCv", method = RequestMethod.POST,
//			  consumes = "application/json")
//    public String requestOTP( @RequestBody CVDetailsDTO dto ) {
//		 System.out.println(dto);
//        return "done";
//}
}
