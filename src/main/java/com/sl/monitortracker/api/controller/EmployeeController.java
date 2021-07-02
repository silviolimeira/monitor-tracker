package com.sl.monitortracker.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sl.monitortracker.api.dao.EmployeeRepository;
import com.sl.monitortracker.api.model.Employee;


@RestController
public class EmployeeController {

	@Autowired
	private EmployeeRepository repository;
	
	@PostMapping("/saveEmployee")
	public String saveEmployee(@RequestBody Employee employee) {
		repository.save(employee);
		
		return "Emplyee saved.";
	}
	
	@GetMapping("/getAllEmployees")
	public List<Employee> getAll() {
		return repository.findAll();
	}
	
	@GetMapping("/getEmployee/{dept}")
	public List<Employee> getEmployeeByDept(@PathVariable String dept) {
		return repository.findByDept(dept);
	}
	
}
