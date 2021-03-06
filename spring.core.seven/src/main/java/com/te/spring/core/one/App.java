package com.te.spring.core.one;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.te.spring.core.one.beans.Student;
import com.te.spring.core.one.config.AppConfig;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		Student student = (Student) applicationContext.getBean("student");
		System.out.println("===>" + student);
	}
}
