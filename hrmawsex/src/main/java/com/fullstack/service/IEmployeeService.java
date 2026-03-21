package com.fullstack.service;

import java.util.List;

import com.fullstack.model.Employee;

public interface IEmployeeService {
	
	Employee save(Employee employee);
	
	List<Employee> findAll();

}
