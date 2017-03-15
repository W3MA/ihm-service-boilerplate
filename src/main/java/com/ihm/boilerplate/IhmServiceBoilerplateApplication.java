package com.ihm.boilerplate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

import lombok.NoArgsConstructor;

@Configuration
@NoArgsConstructor
@SpringBootApplication()
public class IhmServiceBoilerplateApplication {

	public static void main(String[] args) {
		SpringApplication.run(IhmServiceBoilerplateApplication.class, args);
	}
}
