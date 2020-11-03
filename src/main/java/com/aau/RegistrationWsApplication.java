package com.aau;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.aau.controller","com.aau.service","com.aau.entity","com.aau.repository"})
public class RegistrationWsApplication { 

	public static void main(String[] args) {
		SpringApplication.run(RegistrationWsApplication.class, args);
	}

}
