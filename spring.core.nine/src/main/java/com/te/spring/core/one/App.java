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
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.config.xml");
		Student student1 = (Student) applicationContext.getBean("student");
		Student student2 = (Student) applicationContext.getBean("student");
		Student student3 = (Student) applicationContext.getBean("student");
		Student student4 = (Student) applicationContext.getBean("student");
		System.out.println("===>" + student1.hashCode());
		System.out.println("===>" + student2.hashCode());
		System.out.println("===>" + student3.hashCode());
		System.out.println("===>" + student4.hashCode());
	}
}
