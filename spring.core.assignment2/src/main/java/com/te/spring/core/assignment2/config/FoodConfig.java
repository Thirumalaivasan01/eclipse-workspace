package com.te.spring.core.assignment2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.te.spring.core.assignment2.dto.Biryani;
import com.te.spring.core.assignment2.dto.Food;
import com.te.spring.core.assignment2.dto.FriedRice;
import com.te.spring.core.assignment2.dto.Idli;

@Configuration
public class FoodConfig {

	@Bean(name = "biryani")
	public Food getBiryaniObj() {
		Biryani biryani = new Biryani();
		return biryani;
	}

	@Bean(name = "idli")
	public Food getIdliObj() {
		Idli idli = new Idli();
		return idli;

	}

	@Bean(name = "fried")
	public Food getFriedRiceObj() {
		FriedRice friedRice = new FriedRice();
		return friedRice;
	}
}
