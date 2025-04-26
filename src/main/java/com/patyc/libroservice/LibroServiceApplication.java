package com.patyc.libroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.patyc.libroservice.repository")
@EntityScan(basePackages = "com.patyc.libroservice.model")
public class LibroServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(LibroServiceApplication.class, args);
	}
}