package com.management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.management.dao.EmployeeDao;
import com.management.entities.EmployeeEntity;
import com.management.service.EmployeeService;

@RestController
@RequestMapping("/Management")
public class EmployeeController {

	@Autowired
	private EmployeeDao employeeDao;
	@Autowired
	private EmployeeService employeeService;

	@PostMapping("/employee")
	public void addEmployee(@RequestBody EmployeeEntity employee) {

		this.employeeService.addEmployee(employee);

	}

	@PutMapping("/employee/{id}")
	public EmployeeEntity updateEmployee(@RequestBody EmployeeEntity employee, @PathVariable("id") int id) {
		EmployeeEntity emp = employeeService.updateEmployee(employee, id);
		return emp;
	}

	@GetMapping("/employees")
	public List<EmployeeEntity> getEmployees() {
		List<EmployeeEntity> list = employeeService.getAllEmployees();
		return list;
	}

	@DeleteMapping("/deleteEmployee/{id}")
	public void delete(@PathVariable("id") int id) {
		this.employeeService.delete(id);
	}
}
