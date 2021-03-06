package com.te.spring.core.one.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import com.te.spring.core.one.beans.Peacock;

public class PeacockConfig {
	@Bean(name = "peacock")
	@Primary
	public Peacock getPeacockObj() {
		Peacock peacock = new Peacock();
		peacock.creatureName();
		peacock.creatureType();
		return peacock;
	}
}
