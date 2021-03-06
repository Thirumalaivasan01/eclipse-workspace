package com.te.spring.core.assignment3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.te.spring.core.assignment3.config.AllConfig;
import com.te.spring.core.assignment3.dto.Child;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AllConfig.class);
		Object bean = applicationContext.getBean("all");
		Child child = (Child) bean;
		System.out.println("===>" + child);
	}
}
