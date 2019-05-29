package com.baeldung.jaxws;

import org.springframework.stereotype.Repository;

import com.baeldung.jaxws.model.Employee;

@Repository
public class EmployeeRepository implements EmployeeRepositoryInterface{

	public Employee getEmployee(int id) {
		Employee e = new Employee();
		e.setFirstName("Marko");
		e.setId(1);
		return e;
	}

	public Employee updateEmployee(int id, String name) {
		return null;
	}

	public boolean deleteEmployee(int id) {
		return false;
	}

	public Employee addEmployee(int id, String name) {
		return null;
	}

}
