package com.sl.monitortracker.api.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sl.monitortracker.api.model.Employee;


@RestController
public class EmployeeController {

	
	@PostMapping("/saveEmployee")
	public String saveEmployee(@RequestBody Employee employee) {
		
		return "Emplyee saved 1.";
	}
	
	@GetMapping("/getAllEmployees")
	public List<Employee> getAll() {
		List<Employee> list = new ArrayList<>();
		
		return list;
	}
	
	@GetMapping("/getEmployee/{dept}")
	public List<Employee> getEmployeeByDept(@PathVariable String dept) {
		List<Employee> list = new ArrayList<>();
		
		return list;
	}
	
}
