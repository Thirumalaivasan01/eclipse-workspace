import java.util.Scanner;

public class Fibbonacy {
	public static void main(String args[]) {
		// System.out.println("...");
		int a = 0;
		int b = 1;
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many numbers you need in fibonacci series");
		n = sc.nextInt();
		System.out.println(a + "\n" + b);
		for (int i = 0; i < n - 2; i++) {

			int c = a + b;
			System.out.println(c);
			a = b;
			b = c;
		}

	}
}
