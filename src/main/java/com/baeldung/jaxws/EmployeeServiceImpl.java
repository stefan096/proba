package com.baeldung.jaxws;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.springframework.stereotype.Service;

import com.baeldung.jaxws.model.Employee;

@WebService(endpointInterface = "com.baeldung.jaxws.EmployeeService")
@Service
public class EmployeeServiceImpl implements EmployeeService {
  
	private EmployeeRepository employeeRepositoryImpl = new EmployeeRepository();

	
    @WebMethod
    public Employee getEmployee(int id) {
    	Employee e = new Employee();
		e.setFirstName("Marko");
		e.setId(1);
        return employeeRepositoryImpl.getEmployee(id);
    }
 
    @WebMethod
    public Employee updateEmployee(int id, String name) {
        return employeeRepositoryImpl.updateEmployee(id, name);
    }
 
    @WebMethod
    public boolean deleteEmployee(int id) {
        return employeeRepositoryImpl.deleteEmployee(id);
    }
 
    @WebMethod
    public Employee addEmployee(int id, String name) {
        return employeeRepositoryImpl.addEmployee(id, name);
    }
 
}