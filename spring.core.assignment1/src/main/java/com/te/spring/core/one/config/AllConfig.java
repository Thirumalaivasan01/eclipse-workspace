package com.te.spring.core.one.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

import com.te.spring.core.one.beans.Earth;
import com.te.spring.core.one.beans.HumanBeing;

@Import({GoldFishConfig.class,LionConfig.class,PeacockConfig.class,HumanBeingConfig.class})
public class AllConfig {

@Bean(name="earth")
public Earth getEarthObject() {
	Earth earth=new Earth();
	earth.setPlanetRadius(8217382347d);
	earth.setWaterOnPlanetPercentage(72.928832d);
	return earth;
}

}
