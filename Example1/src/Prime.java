import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		int n, flag = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check prime");
		n = sc.nextInt();
		for (int i = 2; i < n / 2; i++) {
			if (n % i == 0) {

				flag = 1;
				break;
			}
		}
		if (flag == 1) {
			System.out.println("It is not a prime number");
		} else {
			System.out.println("It is a prime number");
		}
	}
}
