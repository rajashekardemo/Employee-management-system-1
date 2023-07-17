package com.dailyCodeBuffer.employee.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dailyCodeBuffer.employee.Entity.Employee;
import com.dailyCodeBuffer.employee.Error.EmployeeNotFoundException;
import com.dailyCodeBuffer.employee.Repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeRepository repository;

	@Override
	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return repository.save(employee);
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Employee FindByEmployeeId(Long employeeId) throws EmployeeNotFoundException {
		  Optional<Employee> emp = repository.findById(employeeId);
		if(!emp.isPresent()) {
			throw new EmployeeNotFoundException("Employee not found ");
		}
		return emp.get();
	}

	@Override
	public void DeleteById(Long employeeId) {
		// TODO Auto-generated method stub
		repository.deleteById(employeeId);
		
	}

	@Override
	public String UpdateEmployeeById(Long employeeId, Employee employeeDetails) {
		// TODO Auto-generated method stub
	    Employee emp = repository.findById(employeeId).get();
	    emp.setDepartment(employeeDetails.getDepartment());
	    emp.setEmployeeId(employeeDetails.getEmployeeId());
	    emp.setName(employeeDetails.getName());
	    emp.setSalary(employeeDetails.getSalary());
	    repository.save(emp);
		return "Updated Successfully";
	}

	@Override
	public Employee getEmployeeByDepartmentName(String name) {
		return repository.findByNameIgnoreCase(name);
	}





}
