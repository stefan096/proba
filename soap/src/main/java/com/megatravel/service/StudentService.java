package com.megatravel.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.megatravel.model.Student;

@WebService
public interface StudentService {
    @WebMethod
    Student getStudent(int id);
 
    @WebMethod
    Student updateStudent(int id, String name);
 
    @WebMethod
    boolean deleteStudent(int id);
 
    @WebMethod
    Student addStudent(int id, String name);
 
}
