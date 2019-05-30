package com.baeldung.jaxws.proba;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.baeldung.jaxws.model.Student;

@WebService(endpointInterface = "com.baeldung.jaxws.proba.StudentService")
public class StudentServiceImpl implements StudentService {
  
	private StudentRepository studentRepository = new StudentRepository();

	
    @WebMethod
    public Student getStudent(int id) {
    	Student e = new Student();
		e.setName("Marko");
		e.setId(1L);
		e.setLastName("Markovic");
        return studentRepository.getStudent();
    }


	@Override
	public Student proba(String name) {
		return studentRepository.probaName(name);
	} 
}