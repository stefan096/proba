package com.baeldung.jaxws.proba;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.springframework.stereotype.Service;

import com.baeldung.jaxws.model.Student;

@WebService
public interface StudentService {
    @WebMethod
    Student getStudent(int id);
    
    @WebMethod
    Student proba(String name);
 
}
