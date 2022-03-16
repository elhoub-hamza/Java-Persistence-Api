package com.example.japap;

import com.example.japap.entities.Patient;
import com.example.japap.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class JapApApplication implements CommandLineRunner {
	@Autowired
	private PatientRepository patientRepository;
	public static void main(String[] args) {
		SpringApplication.run(JapApApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	patientRepository.save(new Patient(null,"hamza",new Date(),false,50));
	patientRepository.save(new Patient(null,"yassir",new Date(),true,01));
		patientRepository.save(new Patient(null,"issac",new Date(),false,90));

	}
}
