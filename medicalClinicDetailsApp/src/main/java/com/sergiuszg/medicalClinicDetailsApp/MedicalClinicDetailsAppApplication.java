package com.sergiuszg.medicalClinicDetailsApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class MedicalClinicDetailsAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MedicalClinicDetailsAppApplication.class, args);
	}

}
