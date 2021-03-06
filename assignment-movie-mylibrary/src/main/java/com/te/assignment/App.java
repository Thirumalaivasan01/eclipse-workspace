package com.te.assignment;

import java.util.ArrayList;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.te.mylibrary.dto.Actor;
import com.te.mylibrary.dto.Director;
import com.te.mylibrary.dto.Movie;
import com.te.mylibrary.dto.MovieCast;
import com.te.mylibrary.dto.MovieRating;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pu-sql-01");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Actor actor = new Actor();
		actor.setActorName("vijay");
		actor.setActorGender("male");

		MovieCast cast = new MovieCast();
		cast.setRole("police");

		actor.setCast(cast);
		cast.setActor(actor);

		// ======================================================//

		Director director = new Director();
		director.setDirectorName("nelson");
		director.setDirectorPhone("8734938390");

		ArrayList<Movie> movieList = new ArrayList<Movie>();
		Movie movie1 = new Movie();
		movie1.setMovieLanguage("tamil");
		movie1.setMovieTitle("beast");
		movie1.setMovieYear(2022);
		movieList.add(movie1);

		director.setMovieList(movieList);
		movie1.setDirector(director);

		// ============================================//

		ArrayList<MovieCast> castList = new ArrayList<MovieCast>();
		castList.add(cast);
		movie1.setCastList(castList);
		cast.setMovie(movie1);

		// ===========================================//

		MovieRating movieRating = new MovieRating();
		movieRating.setReviewStars(3);
		movieRating.setMovie(movie1);
		movie1.setMovieRating(movieRating);

		// ==============================================//

		entityTransaction.begin();

		entityManager.persist(actor);
		entityManager.persist(director);

		entityTransaction.commit();

	}
}
