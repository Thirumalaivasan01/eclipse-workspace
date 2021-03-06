package co.te.mylibrary.dao;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.te.mylibrary.config.MyConfig;
import com.te.mylibrary.dto.Actor;
import com.te.mylibrary.dto.Director;
import com.te.mylibrary.dto.Movie;
import com.te.mylibrary.dto.MovieCast;
import com.te.mylibrary.dto.MovieRating;

public class MyDao {
	public void getSave(String actorName, String actorGender, String role, String directorName, String mobileNumber,
			String movieTitle, String language, int year, int rating) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pu-sql-01");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		MyConfig config = new MyConfig();
		Actor actorObj = config.getActorObj();
		actorObj.setActorName(actorName);
		actorObj.setActorGender(actorGender);

		MovieCast movieCastObj = config.getMovieCastObj();
		movieCastObj.setRole(role);
		actorObj.setCast(movieCastObj);
		movieCastObj.setActor(actorObj);

		Director directorObj = config.getDirectorObj();
		directorObj.setDirectorName(directorName);
		directorObj.setDirectorPhone(mobileNumber);
		Movie movieObj = config.getMovieObj();
		movieObj.setMovieTitle(movieTitle);
		movieObj.setMovieYear(year);
		movieObj.setMovieLanguage(language);
		ArrayList<Movie> movieList = new ArrayList<Movie>();
		movieList.add(movieObj);
		directorObj.setMovieList(movieList);
		movieObj.setDirector(directorObj);

		ArrayList<MovieCast> castList = new ArrayList<MovieCast>();
		castList.add(movieCastObj);
		movieObj.setCastList(castList);
		movieCastObj.setMovie(movieObj);

		MovieRating movieRatingObj = config.getMovieRatingObj();
		movieRatingObj.setReviewStars(rating);
		movieRatingObj.setMovie(movieObj);
		movieObj.setMovieRating(movieRatingObj);

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);

		// Object actor = applicationContext.getBean("actor");
		// Object director = applicationContext.getBean("director");

		
		entityTransaction.begin();
		entityManager.persist(actorObj);
		entityManager.persist(directorObj);

		entityTransaction.commit();

	}

}
