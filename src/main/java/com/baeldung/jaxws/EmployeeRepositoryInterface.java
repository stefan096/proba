package com.baeldung.jaxws;
import org.springframework.stereotype.Repository;

import com.baeldung.jaxws.model.Employee;

@Repository
public interface EmployeeRepositoryInterface {

	public Employee getEmployee(int id);
	
	public Employee updateEmployee(int id, String name);
	
	public boolean deleteEmployee(int id);
	
	public Employee addEmployee(int id, String name);
}
