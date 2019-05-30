package com.megatravel.soap;

import javax.xml.ws.Endpoint;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.megatravel.service.StudentServiceImpl;

@SpringBootApplication
public class SoapApplication {

	public static void main(String[] args) {
		SpringApplication.run(SoapApplication.class, args);
		
		Endpoint.publish("http://localhost:8555/studentservice", new StudentServiceImpl());
	}

}
