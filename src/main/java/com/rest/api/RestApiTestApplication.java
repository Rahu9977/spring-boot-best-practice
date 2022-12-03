package com.rest.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableCaching
@ComponentScan(basePackages = "com.*")
public class RestApiTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestApiTestApplication.class, args);
	}

}
