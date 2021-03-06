package com.te.spring.core.one;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.te.spring.core.one.beans.Student;

/**
 * Hello world!
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.config.xml");
		Student student = (Student) applicationContext.getBean("student01");
		System.out.println("===>" + student);
		applicationContext.close();
	}
}
