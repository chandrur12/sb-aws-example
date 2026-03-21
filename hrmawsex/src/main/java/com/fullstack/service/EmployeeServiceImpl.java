package com.fullstack.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fullstack.model.Employee;
import com.fullstack.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	
	@Override
	public Employee save(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.save(employee);
	}

	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}

}
