package com.baeldung.jaxws.EmployeeServicePublisher;

import javax.xml.ws.Endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.baeldung.jaxws.EmployeeRepository;
import com.baeldung.jaxws.EmployeeServiceImpl;

@SpringBootApplication
public class EmployeeServicePublisherApplication {
	
	public static void main(String[] args) {

		Endpoint.publish("http://localhost:8555/employeeservice", new EmployeeServiceImpl());

		SpringApplication.run(EmployeeServicePublisherApplication.class, args);
	}
}
