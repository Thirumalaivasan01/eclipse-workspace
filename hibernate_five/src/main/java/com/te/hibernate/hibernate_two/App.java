package com.te.hibernate.hibernate_two;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.te.hibernate.hibernate_two.dto.Actor;
import com.te.hibernate.hibernate_two.dto.Director;
import com.te.hibernate.hibernate_two.dto.Movie;

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

		Actor actor1 = new Actor();
		actor1.setActorName("vijay");
		Actor actor2 = new Actor();
		actor2.setActorName("surya");

		Director director1 = new Director();
		director1.setDirectorName("Shankar");
		Director director2 = new Director();
		director2.setDirectorName("rajamouli");

		Movie movie1 = new Movie();
		Movie movie2 = new Movie();
		Movie movie3 = new Movie();
		movie1.setMovieName("Enthiran");
		movie2.setMovieName("Bahubali");
		movie3.setMovieName("3");

		ArrayList<Movie> movies = new ArrayList<Movie>();
		movies.add(movie1);
		movies.add(movie2);
		movies.add(movie3);

		ArrayList<Actor> actors = new ArrayList<Actor>();
		actors.add(actor1);
		actors.add(actor2);

		actor1.setMovies(movies);
		actor2.setMovies(movies);

		movie1.setActors(actors);
		movie2.setActors(actors);

		director1.setMovies(movies);
		movie2.setDirector(director2);
		movie1.setDirector(director1);
		// entityManager.find(Course.class, 1);

		entityTransaction.begin();
		entityManager.persist(movie1);
		entityManager.persist(movie2);

		entityTransaction.commit();

	}
}
