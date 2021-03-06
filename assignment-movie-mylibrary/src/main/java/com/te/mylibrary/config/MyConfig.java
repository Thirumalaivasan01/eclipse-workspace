package com.te.mylibrary.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.te.mylibrary.dto.Actor;
import com.te.mylibrary.dto.Director;
import com.te.mylibrary.dto.Movie;
import com.te.mylibrary.dto.MovieCast;
import com.te.mylibrary.dto.MovieRating;

@Configuration
public class MyConfig {
	@Bean(name = "actor")
	@Primary
	public Actor getActorObj() {
		Actor actor = new Actor();
		// actor.setActorName(actorName);
		// actor.setActorGender(actorGender);
		return actor;
	}

	@Bean(name = "director")
	public Director getDirectorObj() {
		Director director = new Director();
		// director.setDirectorName("bala");
		// director.setDirectorPhone("9838872389");

		return director;
	}

	@Bean(name = "movie")
	public Movie getMovieObj() {
		Movie movie = new Movie();
		// movie.setMovieLanguage("tamil");
		// movie.setMovieTitle("pithamagan");
		// movie.setMovieYear(2002);
		return movie;
	}

	@Bean(name = "movieCast")
	public MovieCast getMovieCastObj() {
		MovieCast movieCast = new MovieCast();
		movieCast.setRole("Hero");
		return movieCast;

	}

	@Bean(name = "movieRating")
	public MovieRating getMovieRatingObj() {
		MovieRating movieRating = new MovieRating();
		movieRating.setReviewStars(3);
		return movieRating;
	}

	@Bean("castList")
	public List<MovieCast> getCastList() {
		List castList = new ArrayList();
		castList.add(getMovieCastObj());

		return castList;
	}

	@Bean(name = "MovieList")
	public List<Movie> getMovieList() {
		List movieList = new ArrayList();
		movieList.add(getMovieObj());
		return movieList;
	}

	/*
	 * @Override public void afterPropertiesSet() throws Exception { // TODO
	 * Auto-generated method stub
	 * 
	 * }
	 */
}
