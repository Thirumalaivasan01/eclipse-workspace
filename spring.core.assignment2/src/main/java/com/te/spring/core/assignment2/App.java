package com.te.spring.core.assignment2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.te.spring.core.assignment2.config.AllConfig;
import com.te.spring.core.assignment2.dto.Person;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AllConfig.class);
		Object bean = applicationContext.getBean("all");
		Person person = (Person) bean;
		System.out.println(person);
	}
}
