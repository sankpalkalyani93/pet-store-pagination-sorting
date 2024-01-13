package com.example.PetStorePaginationAndSortingDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class PetStorePaginationAndSortingDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PetStorePaginationAndSortingDemoApplication.class, args);
	}

}
