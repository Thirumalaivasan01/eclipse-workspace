package com.te.designpattern.prototype;

public class PrototypeDemo  {
	public static void main(String[] args) {
		Employee emp = new Employee(1, "Hari", 20000, 24);
		Employee emp2 = null;
		try {
			emp2 = (Employee) emp.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		System.out.println(emp + "\n" + emp2);
		System.out.println(emp.equals(emp2));
	}
}
