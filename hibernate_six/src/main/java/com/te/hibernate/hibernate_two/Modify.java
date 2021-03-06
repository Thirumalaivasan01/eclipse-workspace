package com.te.hibernate.hibernate_two;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.te.hibernate.hibernate_two.dto.Call;
import com.te.hibernate.hibernate_two.dto.Person;
import com.te.hibernate.hibernate_two.dto.Pet;
import com.te.hibernate.hibernate_two.dto.SmartPhone;

public class Modify {
	public static void showCall(EntityManager entityManager, EntityTransaction entityTransaction) {
		String str = "from Call";
		Query query = entityManager.createQuery(str);
		List resultList = query.getResultList();
		System.out.println("CALLER TABLE LIST: \n");
		for (Object object : resultList) {
			Call call = (Call) object;
			System.out.println(call);
		}
	}

	public static void showPerson(EntityManager entityManager, EntityTransaction entityTransaction) {
		String str = "from Person";
		Query query = entityManager.createQuery(str);
		List resultList = query.getResultList();
		System.out.println("PERSON TABLE LIST: \n");
		for (Object object : resultList) {
			Person person = (Person) object;
			System.out.println(person);
		}
	}

	public static void showPet(EntityManager entityManager, EntityTransaction entityTransaction) {
		String str = "from Pet";
		Query query = entityManager.createQuery(str);
		List resultList = query.getResultList();
		System.out.println("PET TABLE LIST: \n");
		for (Object object : resultList) {
			Pet pet = (Pet) object;
			System.out.println(pet);
		}
	}

	public static void showSmartPhone(EntityManager entityManager, EntityTransaction entityTransaction) {
		String str = "from SmartPhone";
		Query query = entityManager.createQuery(str);
		List resultList = query.getResultList();
		System.out.println("SMARTPHONE TABLE LIST: \n");
		for (Object object : resultList) {
			SmartPhone smartPhone = (SmartPhone) object;
			System.out.println(smartPhone);
		}
	}

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("person");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		boolean exit = false;
		int choice1;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Choose the No. to which actoion to be Performed... \n" + "1.Add new data\n"
					+ "2.Update data\n" + "3.Delete data\n" + "4.Read data\n" + "5.Exit ");
			choice1 = sc.nextInt();
			switch (choice1) {
			case 1: {
				Modify.create(entityManager, entityTransaction);
				break;
			}
			case 2: {
				Query updateQuery = null;
				String updateString;
				System.out.println("Enter person Id to continue: ");
				int currentPersonId = sc.nextInt();
				String str = "select * from Person where personId=currentPersonId";
				Query currentquery = entityManager.createQuery(str);
				currentquery.setParameter("currentPersonId", currentPersonId);

				Person currentPerson = (Person) currentquery.getSingleResult();

				String str1 = "select smartPhone from Person where personId=:currentPersonId ";
				Query currentquery1 = entityManager.createQuery(str1);
				currentquery1.setParameter("currentPersonId", currentPersonId);
				SmartPhone currentSmartPhone = (SmartPhone) currentquery1.getSingleResult();

				int choice3;
				System.out.println("Choose the option to Update: \n" + "1.update in Call\n" + "2.update in Pet\n"
						+ "3.Update in SmartPhone\n" + "4.Update in Person");
				choice3 = sc.nextInt();
				switch (choice3) {
				case 1: {
					/*
					 * showCall(entityManager, entityTransaction);
					 * 
					 * System.out.println("Enter the caller Id to Edit:\n"); int callerId =
					 * sc.nextInt(); sc.nextLine();
					 */
					List<Call> callerList=currentSmartPhone.getCallList();
					for (Call call : callerList) {
						
					}
					
					System.out.println("Enter the new Caller Name: \n");
					String newCallerName = sc.nextLine();
					updateString = "update Call set callName=:newCallerName where callId=:callerId";
					updateQuery = entityManager.createQuery(updateString);
					updateQuery.setParameter("newCallerName", newCallerName);
					//updateQuery.setParameter("callerId", callerId);

					entityTransaction.begin();
					int affected = updateQuery.executeUpdate();
					entityTransaction.commit();
					System.out.println("Rows Affected: " + affected);
					break;
				}
				case 2: {

					entityTransaction.begin();
					int affected = updateQuery.executeUpdate();
					entityTransaction.commit();
					System.out.println("Rows Affected: " + affected);
					break;
				}
				case 3: {
					System.out.println("Current SmartPhone Name: " + currentSmartPhone.getSmartName()
							+ "\n Enter the New SmartPhone Name ");
					String newSmartPhoneName = sc.nextLine();
					updateString = "update SmartPhone set smartName=:newSmartPhoneName where smartId=:smartId";
					updateQuery = entityManager.createQuery(updateString);
					updateQuery.setParameter("newSmartPhoneName", newSmartPhoneName);
					updateQuery.setParameter("smartId", currentSmartPhone.getSmartId());

					entityTransaction.begin();
					int affected = updateQuery.executeUpdate();
					entityTransaction.commit();
					System.out.println("Rows Affected: " + affected);
					break;
				}
				case 4: {
					System.out.println(
							"Current Person Name: " + currentPerson.getPersonName() + "\n Enter the New Name ");
					String newName = sc.nextLine();
					updateString = "update Person set personName=:personNewName where personId=:personId";
					updateQuery = entityManager.createQuery(updateString);
					updateQuery.setParameter("personNewName", newName);
					updateQuery.setParameter("personId", currentPerson.getPersonId());

					entityTransaction.begin();
					int affected = updateQuery.executeUpdate();
					entityTransaction.commit();
					System.out.println("Rows Affected: " + affected);
					break;
				}
				default: {
					break;
				}

				}

				break;

			}
			case 3: {
				int choice2;
				String str;
				Query query1 = null;
				System.out.println("Choose which one you want to delete\n" + "1.Delete Caller\n" + "2.Delete Pets\n");
				choice2 = sc.nextInt();
				switch (choice2) {
				case 1: {
					showCall(entityManager, entityTransaction);
					System.out.println("Enter the id to delete: ");
					int id = sc.nextInt();
					str = "delete from Call where callId=:id";

					query1 = entityManager.createQuery(str);
					query1.setParameter("id", id);
					// query1.setParameter("className", className);
					break;
				}
				case 2: {
					showPet(entityManager, entityTransaction);
					System.out.println("Enter the id to delete: ");
					int id = sc.nextInt();
					str = "delete from Pet where petId=:id";

					query1 = entityManager.createQuery(str);
					query1.setParameter("id", id);
					break;
				}
				default: {
					break;
				}

				}
				entityTransaction.begin();
				int affected = query1.executeUpdate();
				entityTransaction.commit();
				System.out.println("Rows Affected " + affected);
				break;
			}
			case 4: {
				break;
			}
			case 5: {
				exit = true;
				System.out.println("Exit Successful");
				break;
			}
			}

		} while (!exit);

	}

	public static void create(EntityManager entityManager, EntityTransaction entityTransaction) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the following Details: ");
		System.out.println("Enter the caller Name: ");
		String caller = sc.nextLine();
		System.out.println("Enter the Person Name: ");
		String person = sc.nextLine();
		System.out.println("Enter the MobilePhone Name: ");
		String mobile = sc.nextLine();
		System.out.println("Enter Pet Name: ");
		String pet = sc.nextLine();
		Person person1 = new Person();
		person1.setPersonName(person);

		SmartPhone smartPhone1 = new SmartPhone();
		smartPhone1.setSmartName(mobile);

		Pet pet1 = new Pet();
		pet1.setPetName(pet);

		Call call1 = new Call();
		call1.setCallName(caller);
		call1.setSmartPhone(smartPhone1);
		ArrayList<Person> personList = new ArrayList<Person>();
		personList.add(person1);

		ArrayList<Call> callList = new ArrayList<Call>();
		callList.add(call1);

		ArrayList<Pet> petList = new ArrayList<Pet>();
		petList.add(pet1);

		person1.setSmartPhone(smartPhone1);
		person1.setPetList(petList);

		smartPhone1.setPerson(person1);

		entityTransaction.begin();
		entityManager.persist(person1);
		entityTransaction.commit();

	}
}
