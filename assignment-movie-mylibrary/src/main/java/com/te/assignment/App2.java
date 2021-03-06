package com.te.assignment;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.te.mylibrary.dto.Actor;
import com.te.mylibrary.dto.Director;
import com.te.mylibrary.dto.Movie;
import com.te.mylibrary.dto.MovieCast;
import com.te.mylibrary.dto.MovieRating;

/**
 * Hello world!
 *
 */
public class App2 {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pu-sql-01");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public static void main(String[] args) throws InputMismatchException {
		System.out.println("Hello World!");

		/*
		 * Actor actor = new Actor(); actor.setActorName("vijay");
		 * actor.setActorGender("male");
		 * 
		 * MovieCast cast = new MovieCast(); cast.setRole("police");
		 * 
		 * actor.setCast(cast); cast.setActor(actor);
		 * 
		 * // ======================================================//
		 * 
		 * Director director = new Director(); director.setDirectorName("nelson");
		 * director.setDirectorPhone("8734938390");
		 * 
		 * ArrayList<Movie> movieList = new ArrayList<Movie>(); Movie movie1 = new
		 * Movie(); movie1.setMovieLanguage("tamil"); movie1.setMovieTitle("beast");
		 * movie1.setMovieYear(2022); movieList.add(movie1);
		 * 
		 * director.setMovieList(movieList); movie1.setDirector(director);
		 * 
		 * // ============================================//
		 * 
		 * ArrayList<MovieCast> castList = new ArrayList<MovieCast>();
		 * castList.add(cast); movie1.setCastList(castList); cast.setMovie(movie1);
		 * 
		 * // ===========================================//
		 * 
		 * MovieRating movieRating = new MovieRating(); movieRating.setReviewStars(3);
		 * movieRating.setMovie(movie1); movie1.setMovieRating(movieRating);
		 * 
		 * // ==============================================//
		 * 
		 * entityTransaction.begin();
		 * 
		 * entityManager.persist(actor); entityManager.persist(director);
		 * 
		 * entityTransaction.commit();
		 */
		boolean exit = false;
		do {
			System.out.println("Enter the CRUD operation which you want to be done : \n" + "1.Create a Record\n"
					+ "2.Read an existing Record\n" + "3.Update an existing Record\n" + "4.Delete a Record\n"
					+ "5.Exit");
			int choice = 0;
			int choiceRead = 0;

			Scanner sc = new Scanner(System.in);
			choice = sc.nextInt();

			switch (choice) {
			case 1: {

				createRecord();
				break;
			}
			case 2: {
				System.out.println("Select table to show: ");
				System.out.println("1.View records in Actor table");
				System.out.println("2.View records in Director table");
				System.out.println("3.View records in Movie table");
				System.out.println("4.View records in Movie cast table");
				System.out.println("5.View records in Movie Rating Table");
				choiceRead = sc.nextInt();
				String showStr = "";
				switch (choiceRead) {

				case 1: {

					Show.showActor();
					break;
				}
				case 2: {
					Show.showDirector();
					break;
				}
				case 3: {
					Show.showMovie();
					break;
				}
				case 4: {
					Show.showMovieCast();
					break;
				}
				case 5: {
					Show.showMovieRating();
					break;
				}
				}
				break;
			}
			case 3: {
				System.out.println("Select table to Update: ");
				System.out.println("1.Update records in Actor table");
				System.out.println("2.Update records in Director table");
				System.out.println("3.Update records in Movie table");
				System.out.println("4.Update records in Movie cast table");
				System.out.println("5.Update records in Movie Rating Table");
				choiceRead = sc.nextInt();
				String updateStr = "";
				Update update = new Update();
				switch (choiceRead) {

				case 1: {
					update.updateActor();

					break;
				}
				case 2: {
					update.updateDirector();
					break;
				}
				case 3: {
					update.updateMovie();
					break;
				}
				case 4: {
					update.updateMovieCast();
					break;
				}
				case 5: {
					update.updateMovieRating();
					break;
				}
				}
				break;
			}
			case 4: {
				App3 newobj = new App3();
				newobj.executeQuery2();
				// App2 obj = new App2();
				// obj.deleteRecord();
				break;
			}
			case 5: {
				exit = true;
				System.out.println("Exit Successful!!");
			}
			}
		} while (!exit);
	}

	static EntityManager getEntityManger() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pu-sql-01");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		return entityManager;
	}

	static EntityTransaction getEntityTransaction() {
		EntityTransaction entityTransaction = getEntityManger().getTransaction();
		return entityTransaction;
	}

	public static void createRecord() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pu-sql-01");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Below Details: \n");
		String actorName, actorGender;
		Actor actor = new Actor();
		System.out.println("Enter Actor Name: ");
		actorName = sc.nextLine();
		actor.setActorName(actorName);
		System.out.println("Enter actor Gender: ");
		actorGender = sc.nextLine();
		actor.setActorGender(actorGender);

		MovieCast cast = new MovieCast();
		System.out.println("Enter the actor Role: ");
		String role = sc.nextLine();
		cast.setRole(role);

		actor.setCast(cast);
		cast.setActor(actor);

		// ============================//

		Director director = new Director();
		System.out.println("Enter director name: ");
		String directorName = sc.nextLine();
		director.setDirectorName(directorName);
		System.out.println("Enter director Mobile number: ");
		String mobileNumber = sc.nextLine();
		director.setDirectorPhone(mobileNumber);

		ArrayList<Movie> movieList = new ArrayList<Movie>();
		System.out.println("Enter the movie details for director: ");
		Movie movie1 = new Movie();
		System.out.println("Enter movie title: ");
		String title = sc.nextLine();
		System.out.println("Enter the movie Language: ");
		String language = sc.nextLine();
		movie1.setMovieLanguage(language);
		movie1.setMovieTitle(title);
		System.out.println("Enter the movie Year: ");
		int year = sc.nextInt();
		sc.nextLine();
		movie1.setMovieYear(year);
		movieList.add(movie1);
		movie1.setDirector(director);
		movieList.add(movie1);

		director.setMovieList(movieList);

		// ====================================//

		ArrayList<MovieCast> castList = new ArrayList<MovieCast>();
		castList.add(cast);
		movie1.setCastList(castList);
		cast.setMovie(movie1);

		// ======================================//

		MovieRating movieRating = new MovieRating();
		System.out.println("Enter the rating star for the movie: ");
		int rating = sc.nextInt();
		movieRating.setReviewStars(rating);
		movieRating.setMovie(movie1);
		movie1.setMovieRating(movieRating);

		entityTransaction.begin();
		entityManager.persist(actor);
		entityManager.persist(director);

		entityTransaction.commit();

	}

	public void deleteRecord() {
		Show.showMovieRating();
		Scanner sc = new Scanner(System.in);
		System.out.println("You can delete the record only in Movie Rating table: ");
		System.out.println("Please enter the rating Id to delete: ");
		int id = sc.nextInt();
		String str = "delete from MovieRating where mrId=:id";
		Query deleteQuery = entityManager.createQuery(str);
		deleteQuery.setParameter("id", id);
		entityTransaction.begin();
		int affected = deleteQuery.executeUpdate();
		entityTransaction.commit();
		System.out.println("Rows Affected: " + affected);
	}

}
