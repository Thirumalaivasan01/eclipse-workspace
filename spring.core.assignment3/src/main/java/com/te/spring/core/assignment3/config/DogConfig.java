package com.te.spring.core.assignment3.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.te.spring.core.assignment3.dto.Dog;

@Configuration
public class DogConfig {
	@Bean(name = "dog")
	public Dog getDogObj() {
		Dog dog = new Dog();
		return dog;
	}
}
