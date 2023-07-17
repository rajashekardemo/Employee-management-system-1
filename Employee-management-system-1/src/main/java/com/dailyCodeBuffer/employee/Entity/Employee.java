package com.dailyCodeBuffer.employee.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long employeeId;
	private String name;
	private int salary;
	private String department;
	
	public Employee() {
		super();
	}
	
	public Employee(Long employeeId, String name, int salary, String department) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.salary = salary;
		this.department = department;
	}
	public Long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	
	
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + ", salary=" + salary + ", department="
				+ department + "]";
	}
	
	
	
	
	
	
	


}
