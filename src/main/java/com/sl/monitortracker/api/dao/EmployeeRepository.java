package com.sl.monitortracker.api.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sl.monitortracker.api.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

	List<Employee> findByDept(String dept);

}
