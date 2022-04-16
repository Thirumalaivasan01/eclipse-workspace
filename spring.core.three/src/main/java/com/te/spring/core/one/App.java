package com.te.spring.core.one;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.te.spring.core.one.beans.Student;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.config.xml");
		Student student1 = (Student) applicationContext.getBean("student01");
		Student student2 = (Student) applicationContext.getBean("student02");
		System.out.println("==>" + student1);
		System.out.println("==>" + student2);
	}
}
