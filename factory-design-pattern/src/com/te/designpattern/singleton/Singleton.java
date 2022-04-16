package com.te.designpattern.singleton;

public class Singleton {
	private int availableTickets;
	private static Singleton object;

	private Singleton() {
		this.availableTickets = 100;
	}

	public static Singleton createObject() {
		if (object == null) {
			object = new Singleton();
			return object;
		}
		return object;
	}

	public int getAvailableTickets() {
		return availableTickets;
	}

	public void setAvailableTickets(int availableTickets) {
		this.availableTickets = availableTickets;
	}
}
