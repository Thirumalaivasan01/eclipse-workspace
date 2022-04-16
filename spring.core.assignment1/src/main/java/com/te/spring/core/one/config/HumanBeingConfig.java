package com.te.spring.core.one.config;

import org.springframework.context.annotation.Bean;

import com.te.spring.core.one.beans.HumanBeing;

public class HumanBeingConfig {
	@Bean(name = "human")
	public HumanBeing getHumanBeingObj() {
		HumanBeing humanBeing = new HumanBeing();
		humanBeing.creatureName();
		humanBeing.creatureType();
		return humanBeing;

	}
}
