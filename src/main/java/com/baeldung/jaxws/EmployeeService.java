package com.baeldung.jaxws;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.springframework.stereotype.Service;

import com.baeldung.jaxws.model.Employee;

@WebService
@Service
public interface EmployeeService {
    @WebMethod
    Employee getEmployee(int id);
 
    @WebMethod
    Employee updateEmployee(int id, String name);
 
    @WebMethod
    boolean deleteEmployee(int id);
 
    @WebMethod
    Employee addEmployee(int id, String name);
 
}
