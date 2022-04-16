package com.te.spring.core.assignment2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.te.spring.core.assignment2.dto.AppleJuice;
import com.te.spring.core.assignment2.dto.CocaCola;
import com.te.spring.core.assignment2.dto.Drinks;
import com.te.spring.core.assignment2.dto.MilkShake;

@Configuration
public class DrinksConfig {

	@Bean(name = "cola")
	public Drinks getCocaColaObj() {
		CocaCola cocaCola = new CocaCola();
		return cocaCola;
	}

	@Bean(name = "apple")
	public Drinks getAppleJuiceObj() {
		AppleJuice appleJuice = new AppleJuice();
		return appleJuice;
	}

	@Bean(name = "milk")
	public Drinks getMilkShakeObj() {
		MilkShake milkShake = new MilkShake();
		return milkShake;
	}
}
