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
		Student student = (Student) applicationContext.getBean("student01");
		Student student1 = (Student) applicationContext.getBean("student01");
		System.out.println("===>" + student.hashCode());
		System.out.println("===>" + student1.hashCode());
		System.out.println();
	}
}
