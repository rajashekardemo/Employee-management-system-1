package com.dailyCodeBuffer.employee.Controller;

import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dailyCodeBuffer.employee.Entity.Employee;
import com.dailyCodeBuffer.employee.Error.EmployeeNotFoundException;
import com.dailyCodeBuffer.employee.Repository.EmployeeRepository;
import com.dailyCodeBuffer.employee.Service.EmployeeService;

@RestController
@RequestMapping("/v1")
public class Controller {
	
	@Autowired
	private EmployeeService service;
	
	private final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(Controller.class);
	
	@PostMapping("/save")
	public Employee saveEmployee(@RequestBody Employee employee) {
		LOGGER.info("Inside save employee method of Employee controller");
		return service.saveEmployee(employee);
		
	}
	
	@GetMapping("/employees")
	public List<Employee> getAllEmployees(){
		LOGGER.info("Inside getAllemployees method of Employee controller");
		return service.getAllEmployees();
		
	}
	
	@GetMapping("/employees/{employeeId}")
	public Employee FindByEmployeeId(@PathVariable Long employeeId) throws EmployeeNotFoundException {
		LOGGER.info("Inside FindByEmployeeId method of Employee controller");
		return service.FindByEmployeeId(employeeId);
		
	}
	
	@DeleteMapping("/delete/{employeeId}")
	public String DeleteById(@PathVariable Long employeeId) {
		LOGGER.info("Inside DeleteByEmployeeId method of Employee controller");
		service.DeleteById(employeeId);
		return "Deleted successfully";
		
	}
	
	@PutMapping("/employees/{employeeId}")
	public String UpdateEmployeeById(@PathVariable Long employeeId,@RequestBody Employee employeeDetails) {
		LOGGER.info("Inside UpdateEmployeeById method of Employee controller");
		return service.UpdateEmployeeById(employeeId,employeeDetails);
		
	}
	
	@GetMapping("/employees/department/{name}")
	public Employee getEmployeeByDepartmentName(@PathVariable String name) {
		LOGGER.info("Inside getEmployeeByDepartmentName method of Employee controller");
		return service.getEmployeeByDepartmentName(name);
		
	}
	

}
