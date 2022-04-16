package com.te.hibernate.hibernate_two;

import java.util.ArrayList;

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

		Address address1 = new Address();
		address1.setALine01("Line01");

		Address address2 = new Address();
		address2.setALine01("Line011");

		ArrayList<Address> addresses = new ArrayList<Address>();
		addresses.add(address1);
		addresses.add(address2);

		Student student = new Student();
		student.setSAge(22);
		student.setSName("Name01");
		student.setAddresses(addresses);
		address1.setStudent(student);
		address2.setStudent(student);

		entityTransaction.begin();
		entityManager.persist(student);
		entityTransaction.commit();

	}
}
