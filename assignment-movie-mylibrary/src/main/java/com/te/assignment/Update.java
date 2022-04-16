package com.te.assignment;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Update {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pu-sql-01");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	void updateActor() {
		Scanner sc = new Scanner(System.in);
		String updateStr = "update Actor set actorName=:name,actorGender=:gender where actorId=:id";
		Query query = entityManager.createQuery(updateStr);
		System.out.println("Enter the Actor Id: ");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Actor Name to update: ");
		String name = sc.nextLine();
		System.out.println("Enter Actor gender to update: ");
		String gender = sc.nextLine();
		query.setParameter("name", name);
		query.setParameter("id", id);
		query.setParameter("gender", gender);
		entityTransaction.begin();
		int affected = query.executeUpdate();
		entityTransaction.commit();

		System.out.println("affected lines:" + affected);
	}

	void updateDirector() {
		Scanner sc = new Scanner(System.in);
		String updateStr = "update Director set directorName=:name,directorPhone=:phone where directorId=:id";
		Query query = entityManager.createQuery(updateStr);
		System.out.println("Enter the Director Id: ");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the Director Name: ");
		String name = sc.nextLine();
		System.out.println("Enter the Director phone number: ");
		String phone = sc.nextLine();
		query.setParameter("name", name);
		query.setParameter("id", id);
		query.setParameter("phone", phone);
		entityTransaction.begin();
		int affected = query.executeUpdate();
		entityTransaction.commit();

		System.out.println("affected lines:" + affected);
	}

	void updateMovie() {
		Scanner sc = new Scanner(System.in);
		String updateStr = "update Movie set movieTitle=:title,movieYear=:year,movieLanguage=:language where movieId=:id";
		Query query = entityManager.createQuery(updateStr);
		System.out.println("Enter the Movie Id: ");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the Movie Title: ");
		String title = sc.nextLine();
		System.out.println("Enter the Movie Language: ");
		String language = sc.nextLine();
		System.out.println("Enter the Movie year: ");
		int year = sc.nextInt();
		sc.nextLine();

		query.setParameter("title", title);
		query.setParameter("id", id);
		query.setParameter("language", language);
		query.setParameter("year", year);
		entityTransaction.begin();
		int affected = query.executeUpdate();
		entityTransaction.commit();

		System.out.println("affected lines:" + affected);
	}

	void updateMovieCast() {
		Scanner sc = new Scanner(System.in);
		String updateStr = "update MovieCast set role=:role where actor.actorId=:id";
		Query query = entityManager.createQuery(updateStr);
		System.out.println("Enter the Actor Id: ");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Actor Role to update: ");
		String role = sc.nextLine();

		query.setParameter("role", role);
		query.setParameter("id", id);

		entityTransaction.begin();
		int affected = query.executeUpdate();
		entityTransaction.commit();

		System.out.println("affected lines:" + affected);
	}

	void updateMovieRating() {
		Scanner sc = new Scanner(System.in);
		String updateStr = "update MovieRating set reviewStars=:stars where movie.movieId=:id";
		Query query = entityManager.createQuery(updateStr);
		System.out.println("Enter the Movie Id to edit castTable: ");
		int id = sc.nextInt();

		System.out.println("Enter review Star to update: ");
		int stars = sc.nextInt();

		query.setParameter("stars", stars);
		query.setParameter("id", id);

		entityTransaction.begin();
		int affected = query.executeUpdate();
		entityTransaction.commit();

		System.out.println("affected lines:" + affected);
	}

}
