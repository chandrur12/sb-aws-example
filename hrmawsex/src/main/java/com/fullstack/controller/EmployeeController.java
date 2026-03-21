package com.fullstack.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fullstack.model.Employee;
import com.fullstack.service.IEmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

	@Autowired
	private IEmployeeService employeeService;

	@PostMapping("/save")
	public ResponseEntity<Employee> save(@RequestBody Employee employee) {
		return ResponseEntity.ok(employeeService.save(employee));
	}

	@GetMapping("/findall")
	public ResponseEntity<List<Employee>> findAll() {
		return ResponseEntity.ok(employeeService.findAll());
	}

}
