package com.te.hibernate.hibernate_one;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.metamodel.model.domain.EntityDomainType;

import com.te.hibernate.hibernate_one.bean.Address;
import com.te.hibernate.hibernate_one.bean.Person;
import com.te.hibernate.hibernate_one.bean.Student;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		/*System.out.println("Reached Hibernate!!");
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pu-sql-01");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Person person = new Person(1, "Name01", 25);
		
		entityTransaction.begin();
		entityManager.persist(person);
		entityTransaction.commit();*/
		System.out.println("Reached Hibernate!!");
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pu-sql-01");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Address address = new Address();
		address.setALine01("Line01");
		address.setALine02("Line2");

		Student student = new Student();
		student.setSAge(22);
		student.setSName("Name01");
		student.setAddress(address);
		address.setStudent(student);
		
		Person person = entityManager.find(Person.class, 1);
		
		entityTransaction.begin();
		entityManager.persist(student);
		entityManager.persist(address);
		entityManager.remove(person);
		entityTransaction.commit();
	}
}
