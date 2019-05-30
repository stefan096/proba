package com.baeldung.jaxws.EmployeeServicePublisher;

import javax.xml.ws.Endpoint;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.baeldung.jaxws.EmployeeServiceImpl;
import com.baeldung.jaxws.proba.StudentServiceImpl;

@SpringBootApplication
public class EmployeeServicePublisherApplication {
	
	public static void main(String[] args) {


		SpringApplication.run(EmployeeServicePublisherApplication.class, args);
		
		Endpoint.publish("http://localhost:8555/employeeservice", new EmployeeServiceImpl());
		Endpoint.publish("http://localhost:8555/studentservice", new StudentServiceImpl());
	}
}
