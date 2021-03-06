package com.te.hibernate.hibernate_two;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.te.hibernate.hibernate_two.dto.Call;
import com.te.hibernate.hibernate_two.dto.Person;
import com.te.hibernate.hibernate_two.dto.Pet;
import com.te.hibernate.hibernate_two.dto.SmartPhone;

/**
 * Hello world!
 *
 */

public class App {
	public static void main(String[] args) {
		System.out.println("Reached Hibernate!!");
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("person");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Person person1 = new Person();
		person1.setPersonName("Name01");
		Person person2 = new Person();
		person2.setPersonName("Name02");

		SmartPhone smartPhone1 = new SmartPhone();
		smartPhone1.setSmartName("Redmi");
		SmartPhone smartPhone2 = new SmartPhone();
		smartPhone2.setSmartName("Apple");

		Pet pet1 = new Pet();
		pet1.setPetName("Dog");
		Pet pet2 = new Pet();
		pet2.setPetName("Cat");

		Call call1 = new Call();
		call1.setCallName("caller01");
		call1.setSmartPhone(smartPhone1);
		Call call2 = new Call();
		call2.setCallName("caller02");
		call2.setSmartPhone(smartPhone2);

		ArrayList<Person> personList = new ArrayList<Person>();
		personList.add(person1);
		personList.add(person2);

		ArrayList<Call> callList = new ArrayList<Call>();
		callList.add(call1);
		callList.add(call2);

		ArrayList<Pet> petList = new ArrayList<Pet>();
		petList.add(pet1);
		petList.add(pet2);

		person1.setSmartPhone(smartPhone1);
		person1.setPetList(petList);
		person2.setPetList(petList);
		person2.setSmartPhone(smartPhone2);

		smartPhone1.setPerson(person1);
		smartPhone2.setPerson(person2);
		smartPhone1.setCallList(callList);
		// smartPhone2.setCallList(callList);

		entityTransaction.begin();
		entityManager.persist(person1);
		entityManager.persist(person2);

		entityTransaction.commit();

	}
}
