package com.dailyCodeBuffer.employee.Service;

import java.util.List;
import java.util.Optional;

import com.dailyCodeBuffer.employee.Entity.Employee;
import com.dailyCodeBuffer.employee.Error.EmployeeNotFoundException;
import com.dailyCodeBuffer.employee.Repository.EmployeeRepository;

public interface EmployeeService {

	public Employee saveEmployee(Employee employee);

	public List<Employee> getAllEmployees();

	public Employee FindByEmployeeId(Long employeeId) throws EmployeeNotFoundException;

	public void DeleteById(Long employeeId);

	public String UpdateEmployeeById(Long employeeId, Employee employeeDetails);

	public Employee getEmployeeByDepartmentName(String name);

	

	

}
