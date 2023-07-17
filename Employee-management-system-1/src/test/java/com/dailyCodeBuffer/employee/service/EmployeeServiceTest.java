package com.dailyCodeBuffer.employee.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.dailyCodeBuffer.employee.Entity.Employee;
import com.dailyCodeBuffer.employee.Repository.EmployeeRepository;
import com.dailyCodeBuffer.employee.Service.EmployeeService;

public class EmployeeServiceTest {

	@BeforeEach
	     void setUp(){
		
	}
	
	@Autowired
	private EmployeeService service;
	
	@MockBean
	private EmployeeRepository repository;
	
//	Employee employee = Employee.builder()
//			                 .name("vasu")
//			                 .salary()
//			                 .employeeId(1L)
//	                         .department()
//	                         .build();
	@Test
	public void whenValidEmployeeName_thenEmployeeShouldFound() {
		String name = "vasu";
		Employee found = service.getEmployeeByDepartmentName(name);
		assertEquals(name,found.getName());
	}
}
