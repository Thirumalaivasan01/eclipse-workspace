package com.te.hibernate.hibernate_two;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.te.hibernate.hibernate_two.dto.Course;
import com.te.hibernate.hibernate_two.dto.Student;

/**
 * Hello world!
 *
 */

public class App {
	public static void main(String[] args) {
		System.out.println("Reached Hibernate!!");
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("PU01");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Course course1 = new Course();
		course1.setCName("English");
		Course course2 = new Course();
		course2.setCName("Maths");

		ArrayList<Course> courses = new ArrayList<Course>();
		courses.add(course2);
		courses.add(course1);

		Student student1 = new Student();
		student1.setSAge(22);
		student1.setSName("Name01");
		Student student2 = new Student();
		student2.setSAge(22);
		student2.setSName("Name02");
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(student2);
		students.add(student1);
		student1.setCourses(courses);
		student2.setCourses(courses);
		course1.setStudents(students);
		course2.setStudents(students);
		
		
		
		//entityManager.find(Course.class, 1);
		
		entityTransaction.begin();
		entityManager.persist(student1);
		entityManager.persist(student2);
		
		entityTransaction.commit();

	}
}
