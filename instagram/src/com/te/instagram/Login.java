package com.te.instagram;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// @WebServlet("/login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Login() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Reached!");

		String username = request.getParameter("username");

		if (username.isEmpty())
			System.out.println("Is NULL!");
		System.out.println("Username is " + username);
		
		PrintWriter printWriter = response.getWriter();
		printWriter.println("Dynamic page!");
		printWriter.println("Username is " + username);
	}

}
