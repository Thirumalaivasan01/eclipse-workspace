package com.te.hibernate.hibernate_two;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.te.hibernate.hibernate_two.dto.Student;

public class JPQL05 {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("PU01");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		String str1 = "update Student set sName=: name where sId=:id";

		Query query1 = entityManager.createQuery(str1);
		query1.setParameter("id", 1);
		query1.setParameter("name", "Super man");
		// Object single = query1.getSingleResult();
		entityTransaction.begin();
		int affected = query1.executeUpdate();
		entityTransaction.commit();
		// Student student = (Student) single;
		// System.out.println(student);
		System.out.println("Rows Affected " + affected);

	}

}
