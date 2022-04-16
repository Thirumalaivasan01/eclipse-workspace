package com.te.learn;

import java.util.Scanner;

public class App3 {
	public static void main(String args[]) {
		boolean exit = true;
		Scanner sc = new Scanner(System.in);
		int n;
		do{
			System.out.println("===Calculator===");
			System.out.println(
					"Enter the option to calculate.\n1.addition\n2.subtraction\n3.multiply\n4.divition\n5.exit");
			System.out.println("Enter the option: ");
			n = sc.nextInt();
			switch (n) {
			case 1: {
				System.out.println("Enter first number");
				int a = sc.nextInt();
				System.out.println("Enter second number");
				int b = sc.nextInt();
				int res = Calculator.add(a, b);
				System.out.println(res);
				break;
			}

			case 2: {
				System.out.println("Enter first number");
				int a = sc.nextInt();
				System.out.println("Enter second number");
				int b = sc.nextInt();
				int res = Calculator.sub(a, b);
				System.out.println(res);
				break;
			}

			case 3: {
				System.out.println("Enter first number");
				int a = sc.nextInt();
				System.out.println("Enter second number");
				int b = sc.nextInt();

				int res = Calculator.multi(a, b);
				System.out.println(res);
				break;
			}

			case 4: {
				System.out.println("Enter first number");
				int a = sc.nextInt();
				System.out.println("Enter second number");
				int b = sc.nextInt();
				float res = Calculator.devide(a, b);
				System.out.println(res);
				break;
			}

			case 5: {
				exit = false;
				System.out.println("Exit successfull");
				break;
			}
			default:{
				break;
			}
			}
		}while(exit);
	}
}
