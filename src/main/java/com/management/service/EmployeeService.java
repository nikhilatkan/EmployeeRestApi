package com.management.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.management.dao.EmployeeDao;
import com.management.entities.EmployeeEntity;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;

	public void addEmployee(EmployeeEntity employee) {
		this.employeeDao.save(employee);
	}

	public List<EmployeeEntity> getAllEmployees() {
		List<EmployeeEntity> list = (List<EmployeeEntity>) this.employeeDao.findAll();
		return list;
	}

	public EmployeeEntity updateEmployee(EmployeeEntity employee, int id) {

		return this.employeeDao.save(employee);
	}

	public EmployeeEntity findByEmployeeId(int id) {
		return this.findByEmployeeId(id);
	}

	public void delete(int id) {
		Optional<EmployeeEntity> option = this.employeeDao.findById(id);
		EmployeeEntity employee = option.get();
		this.employeeDao.delete(employee);

	}

}
