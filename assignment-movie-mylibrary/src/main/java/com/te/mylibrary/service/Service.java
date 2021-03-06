package com.te.mylibrary.service;

import co.te.mylibrary.dao.MyDao;

public class Service {
	boolean actorCheck = true, directorCheck = true, movieCheck = true;

	public void checkActorData(String actorName, String actorGender, String role) {
		if (actorName.length() < 3)
			actorCheck = false;
		if (actorGender.equalsIgnoreCase("male") || actorGender.equalsIgnoreCase("female")) {
			
		}
			//actorCheck = true;
		else
			actorCheck = false;
		if (role.length() < 3)
			actorCheck = false;

	}

	public void checkDirectorData(String directorName, String mobileNumber) {
		if (directorName.length() < 3)
			directorCheck = false;
		if (mobileNumber.length() != 10)
			directorCheck = false;
	}

	public void checkMovieData(String movieTitle, String language, int year, int rating) {
		if (movieTitle.length() < 3)
			movieCheck = false;
		if (language.length() < 2)
			movieCheck = false;
		if (year > 2022 || year < 1800)
			movieCheck = false;
		if (rating < 0 || rating > 5)
			movieCheck = false;
	}

	public String check(String actorName, String actorGender, String role, String directorName, String mobileNumber,
			String movieTitle, String language, int year, int rating) {
		if (actorCheck == false)
			return "Please Enter Correct actor data";
		else if (directorCheck == false)
			return "Please Enter correct director data";
		else if (movieCheck == false)
			return "Please Enter correct movie data";
		else {
			MyDao daoObj = new MyDao();
			daoObj.getSave(actorName, actorGender, role, directorName, mobileNumber, movieTitle, language, year,
					rating);
			return "success";
		}

	}

}
