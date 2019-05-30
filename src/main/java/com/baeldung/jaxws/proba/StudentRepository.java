package com.baeldung.jaxws.proba;

import com.baeldung.jaxws.model.Student;

public class StudentRepository {

	public Student getStudent() {
		Student e = new Student();
		e.setName("Marko");
		e.setId(1L);
		e.setLastName("Markovic");
		return e;
	}

	public Student probaName(String name) {
		Student e = new Student();
		e.setName(name);
		e.setId(2L);
		e.setLastName(name);
		return e;
	}

}
