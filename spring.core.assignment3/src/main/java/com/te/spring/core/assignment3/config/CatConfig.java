package com.te.spring.core.assignment3.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.te.spring.core.assignment3.dto.Cat;
import com.te.spring.core.assignment3.dto.Pet;

@Configuration
public class CatConfig {
	@Bean(name = "cat")
	public Cat getCatObj() {
		Cat cat = new Cat();
		return cat;
	}
}
