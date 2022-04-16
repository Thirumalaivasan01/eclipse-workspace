package com.te.spring.core.assignment2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.te.spring.core.assignment2.dto.Person;

@Import({ DrinksConfig.class, FoodConfig.class })
@Configuration
public class AllConfig {
	@Bean(name = "all")
	public Person getDinnerObj() {
		Person person = new Person();
		person.setPersonId(1);
		person.setPersonName("Name01");
		return person;
	}

}
