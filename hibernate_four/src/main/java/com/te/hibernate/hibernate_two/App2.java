package com.te.hibernate.hibernate_two;

import java.util.ArrayList;
import java.util.List;

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

public class App2 {
	public static void main(String[] args) {
		System.out.println("Reached Hibernate!!");
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("PU01");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		
		
		/*Student student = entityManager.find(Student.class, 1);
		student.setSName("New_name");*/
		 Course course = entityManager.find(Course.class, 1);
		 List<Student> students = course.getStudents();
		 
		
		
		Student student=students.get(1);
		student.setSName("Changed Name");
		
		 
		//entityManager.find(Course.class, 1);
		
		entityTransaction.begin();
		
		entityManager.persist(student);
		entityTransaction.commit();

	}
}
