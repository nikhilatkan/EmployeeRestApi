package com.management.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EmployeeEntity {

	@Id
	private int employeeId;
	private String employeeName;
	private String location;
	private String employeeDOB;
	private String email;

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getEmployeeDOB() {
		return employeeDOB;
	}

	public void setEmployeeDOB(String employeeDOB) {
		this.employeeDOB = employeeDOB;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "EmployeeEntity [employeeId=" + employeeId + ", employeeName=" + employeeName + ", location=" + location
				+ ", employeeDOB=" + employeeDOB + ", email=" + email + "]";
	}

	public EmployeeEntity(int employeeId, String employeeName, String location, String employeeDOB, String email) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.location = location;
		this.employeeDOB = employeeDOB;
		this.email = email;
	}

	public EmployeeEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

}
