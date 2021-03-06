package com.te.mylibrary.controller;

import java.util.Scanner;

import com.te.mylibrary.service.Service;

public class MyController {
	public void controller() {
		String checkedResult=null;
		do {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Below Details: \n");
		String actorName, actorGender;

		System.out.println("Enter Actor Name: ");
		actorName = sc.nextLine();

		System.out.println("Enter actor Gender: ");
		actorGender = sc.nextLine();

		System.out.println("Enter the actor Role: ");
		String role = sc.nextLine();

		// ============================//

		System.out.println("Enter director name: ");
		String directorName = sc.nextLine();

		System.out.println("Enter director Mobile number: ");
		String mobileNumber = sc.nextLine();

		// ArrayList<Movie> movieList = new ArrayList<Movie>();
		System.out.println("Enter the movie details for director: ");

		System.out.println("Enter movie title: ");
		String movieTitle = sc.nextLine();
		System.out.println("Enter the movie Language: ");
		String language = sc.nextLine();

		System.out.println("Enter the movie Year: ");
		int year = sc.nextInt();
		sc.nextLine();

		// ====================================//

		System.out.println("Enter the rating star for the movie: ");
		int rating = sc.nextInt();

		Service serviceObj = new Service();
		serviceObj.checkActorData(actorName, actorGender, role);
		serviceObj.checkDirectorData(directorName, mobileNumber);
		serviceObj.checkMovieData(movieTitle, language, year, rating);
		checkedResult = serviceObj.check(actorName, actorGender, role, directorName, mobileNumber, movieTitle,
				language, year, rating);
		System.err.println(checkedResult+"\n");
		}while(!checkedResult.equalsIgnoreCase("success"));
	}
}
