package com.te.spring.core.one.config;

import org.springframework.context.annotation.Bean;

import com.te.spring.core.one.beans.GoldFish;

public class GoldFishConfig {
	@Bean(name = "fish")
	public GoldFish getGoldFishObj() {
		GoldFish goldFish = new GoldFish();
		goldFish.creatureName();
		goldFish.creatureType();

		return goldFish;
	}
}
