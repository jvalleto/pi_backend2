package com.example.pib2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.example.pib2")
@EnableJpaRepositories(basePackages = "com.example.pib2.repository")
@EntityScan(basePackages = "com.example.pib2.model.entity")

public class Pib2Application {

	public static void main(String[] args) {
		SpringApplication.run(Pib2Application.class, args);
	}

}
