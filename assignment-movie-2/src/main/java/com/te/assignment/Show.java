package com.te.assignment;

import java.util.List;

import javax.persistence.Query;

import com.te.assignment.bean.Actor;
import com.te.assignment.bean.Director;
import com.te.assignment.bean.Movie;
import com.te.assignment.bean.MovieCast;
import com.te.assignment.bean.MovieRating;

public class Show {
	public static void showActor() {
		String str = "from Actor";
		Query query = App2.getEntityManger().createQuery(str);
		List actorList = query.getResultList();

		for (Object object : actorList) {
			Actor actor = (Actor) object;
			System.out.println(actor);
		}

	}

	public static void showDirector() {
		String str = "from Director";
		Query query = App2.getEntityManger().createQuery(str);
		List actorList = query.getResultList();

		for (Object object : actorList) {
			Director actor = (Director) object;
			System.out.println(actor);
		}
	}

	public static void showMovie() {
		String str = "from Movie";
		Query query = App2.getEntityManger().createQuery(str);
		List actorList = query.getResultList();

		for (Object object : actorList) {
			Movie actor = (Movie) object;
			System.out.println(actor);
		}
	}

	public static void showMovieCast() {
		String str = "from MovieCast";
		Query query = App2.getEntityManger().createQuery(str);
		List actorList = query.getResultList();

		for (Object object : actorList) {
			MovieCast actor = (MovieCast) object;
			System.out.println(actor);
		}
	}

	public static void showMovieRating() {
		String str = "from MovieRating";
		Query query = App2.getEntityManger().createQuery(str);
		List actorList = query.getResultList();

		for (Object object : actorList) {
			MovieRating actor = (MovieRating) object;
			System.out.println(actor);
		}
	}
}
