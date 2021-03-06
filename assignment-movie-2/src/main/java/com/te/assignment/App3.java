package com.te.assignment;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class App3 {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pu-sql-01");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	public void executeQuery1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the director Name: ");
		String directorName = sc.nextLine();
		String str1 = "select movieTitle from Movie where director.directorId=(select directorId from Director where directorName=:directorName)";
		Query query1 = entityManager.createQuery(str1);
		query1.setParameter("directorName", directorName);
		List actorList = query1.getResultList();
		for (Object object : actorList) {
			String actors = (String) object;
			System.out.println(actors);
		}

	}
	public void executeQuery2() {
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter the director Name: ");
		//String directorName = sc.nextLine();
		String str1 = "select actorName from Actor join MovieCast on Actor.actorId=MovieCast.actor.actorId join Movie on MovieCast.movie.movieId=Movie.movieId where movieYear<2000 ";
		Query query1 = entityManager.createQuery(str1);
		//query1.setParameter("directorName", directorName);
		List actorList = query1.getResultList();
		for (Object object : actorList) {
			String actors = (String) object;
			System.out.println(actors);
		}

	}
}
