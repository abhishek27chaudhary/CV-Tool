package com.cvtool.builder.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cvtool.builder.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {

   List<Employee> findByEmail(String email);
}
