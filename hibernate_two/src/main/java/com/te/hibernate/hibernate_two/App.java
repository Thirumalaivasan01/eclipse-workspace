package com.te.hibernate.hibernate_two;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.te.hibernate.hibernate_two.dto.Address;
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

		Address address = new Address();
		address.setALine01("Line01");

		Student student = new Student();
		student.setSAge(22);
		student.setSName("Name01");
		student.setAddress(address);
		address.setStudent(student);

		entityTransaction.begin();
		entityManager.persist(student);
		entityManager.persist(address);
		entityTransaction.commit();

	}
}
