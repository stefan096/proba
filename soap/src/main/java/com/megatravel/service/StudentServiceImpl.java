package com.megatravel.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.megatravel.model.Student;
import com.megatravel.repository.StudentRepository;

@WebService(endpointInterface = "com.megatravel.service.StudentService")
public class StudentServiceImpl implements StudentService {
  
	private StudentRepository studentRepository = new StudentRepository();

    @WebMethod
    public Student getStudent(int id) {
        return studentRepository.getStudent(id);
    }
    
    @Override
	public Student updateStudent(int id, String name) {
		return studentRepository.updateStudent(id, name);
	}
    
    @WebMethod
    public boolean deleteStudent(int id) {
        return studentRepository.deleteStudent(id);
    }
 
    @WebMethod
    public Student addStudent(int id, String name) {
        return studentRepository.addStudent(id, name);
    }
}