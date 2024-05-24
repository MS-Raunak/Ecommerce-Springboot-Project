package com.ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootEcommerceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootEcommerceApplication.class, args);
		System.out.println("Servler is started in port number 8081");
	}

}
