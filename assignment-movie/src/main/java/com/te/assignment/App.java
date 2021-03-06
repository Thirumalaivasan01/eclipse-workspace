package com.te.assignment;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.te.assignment.bean.Actor;
import com.te.assignment.bean.Director;
import com.te.assignment.bean.Movie;
import com.te.assignment.bean.MovieCast;
import com.te.assignment.bean.MovieRating;

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

		MovieRating movieRating1 = new MovieRating();

		Movie movie1 = new Movie();
		Movie movie = new Movie();
		movie.setMovie_year(2022);

		movie.setMovieTitle("RRR");
		movie.setMovieRatingId(movieRating1);
		movie.setMovieLanguage("Tamil");
		movieRating1.setMovie(movie);

		Director director = new Director();
		director.setDirectorName("nelson");
		director.setDirectorPhone("9382992392");
		movie.setDirector(director);

		Actor actor = new Actor();
		actor.setActorGender("male");
		actor.setActorName("name01");

		// ArrayList<Actor> actorList = new ArrayList<Actor>();
		// actorList.add(actor);

		MovieCast cast1 = new MovieCast();
		cast1.setRole("hero");
		cast1.setActor(actor);
		cast1.setMovie(movie1);

		ArrayList<MovieCast> castList = new ArrayList<MovieCast>();
		castList.add(cast1);
		movie.setMovieList(castList);

		ArrayList<Movie> movieList = new ArrayList<Movie>();
		movieList.add(movie1);

		movieRating1.setReviewStars(5);

		actor.setCast(cast1);

		director.setMovie(movieList);

		movieList.add(movie);
		movieRating1.setMovie(movie);

		/*
		 * Actor actor=new Actor(); actor.setActorName("Actor1");
		 * actor.setActorGender("Male");
		 * 
		 * Actor actor1=new Actor(); actor1.setActorName("Actor2");
		 * actor1.setActorGender("Male");
		 * 
		 * ArrayList<Actor> actors=new ArrayList<Actor>(); actors.add(actor);
		 * actors.add(actor1);
		 */

		entityTransaction.begin();
		entityManager.persist(movie);
		entityManager.persist(actor);
		entityTransaction.commit();
	}
}
