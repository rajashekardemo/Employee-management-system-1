package com.dailyCodeBuffer.employee.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dailyCodeBuffer.employee.Entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long>{

	//public Employee findByName(String name);
	public Employee findByNameIgnoreCase(String name);

}
