package com.megatravel.repository;

import org.springframework.stereotype.Repository;

import com.megatravel.model.Student;

@Repository
public class StudentRepository{

	public Student getStudent(int id) {
		Student student = new Student();
		student.setName("Marko");
		student.setId(id);
		return student;
	}

	public Student updateStudent(int id, String name) {
		return null;
	}

	public boolean deleteStudent(int id) {
		return false;
	}

	public Student addStudent(int id, String name) {
		return null;
	}

}
