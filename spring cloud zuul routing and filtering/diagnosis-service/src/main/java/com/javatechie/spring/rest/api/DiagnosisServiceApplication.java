package com.javatechie.spring.rest.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DiagnosisServiceApplication {
	
	@Value("${server.port}")
	private String port;
	
	@GetMapping("/getDiagnosis")
	public String getDoctorService() {
		return "Diagnosis microservice called...on port : "+port;
	}

	public static void main(String[] args) {
		SpringApplication.run(DiagnosisServiceApplication.class, args);
	}
}