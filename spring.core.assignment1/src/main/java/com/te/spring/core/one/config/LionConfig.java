package com.te.spring.core.one.config;

import org.springframework.context.annotation.Bean;

import com.te.spring.core.one.beans.Lion;

public class LionConfig {
	@Bean(name = "lion")
	public Lion getLionObj() {
		Lion lion = new Lion();
		lion.creatureName();
		lion.creatureType();
		return lion;
	}
}
