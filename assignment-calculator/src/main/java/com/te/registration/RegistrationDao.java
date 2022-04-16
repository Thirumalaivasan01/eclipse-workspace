package com.te.registration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class RegistrationDao {

	public String insert(User user) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("PU01");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();
		entityManager.persist(user);
		entityTransaction.commit();
		String result = "Success";
		return result;
	}

	/*public static void main(String args[]) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("PU01");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		User user = new User();
		user.setFullName("asfda");
		user.setUserName("name");
		user.setPassword("pass");

		entityTransaction.begin();
		entityManager.persist(user);
		entityTransaction.commit();
		String result = "Success";
		// return result;
	}*/
}
