package com.te.spring.core.one;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.te.spring.core.one.beans.Earth;
import com.te.spring.core.one.config.AllConfig;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AllConfig.class);
		Earth earth = (Earth) applicationContext.getBean("earth");
		System.out.println("====>" + earth);
		// System.out.println(earth.getCreature().creatureName());
	}
}
