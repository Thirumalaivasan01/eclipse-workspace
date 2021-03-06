package com.te.designpattern.singleton;

public class Test {
	public static void main(String[] args) {
		Singleton singleton = Singleton.createObject();
		int tickets = singleton.getAvailableTickets();
		System.out.println(tickets);
		tickets -= 1;
		singleton.setAvailableTickets(tickets);
		System.out.println((Singleton.createObject()).getAvailableTickets());
		Singleton newob = Singleton.createObject();
		System.out.println(singleton + "\n" + newob);

	}

}
