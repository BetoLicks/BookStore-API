package com.bookstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.controller")
@EntityScan(basePackages = "com.entity")
@EnableJpaRepositories(basePackages = "com.repositorio")
public class BookstoreApiApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(BookstoreApiApplication.class, args);
	}

}
