package com.te.spring.core.assignment3.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.te.spring.core.assignment3.dto.Cow;

@Configuration
public class CowConfig {
	@Bean(name = "cow")
	@Primary
	public Cow getCowObj() {
		Cow cow = new Cow();
		return cow;
	}
}
