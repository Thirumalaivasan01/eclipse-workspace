package com.te.multi;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Add")
public class Add extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public Add() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Reached");
		String s1=request.getParameter("firstnumber");
		String s2=request.getParameter("secondnumber");
		Integer n1=Integer.parseInt(s1);
		Integer n2=Integer.parseInt(s2);
		Integer res=n1+n2;
		
		PrintWriter printwriter=response.getWriter();
		printwriter.println("The result is :"+res);
	}

}
