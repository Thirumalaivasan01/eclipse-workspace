import java.util.Scanner;

public class Amstrong {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check Amstrong number ");
		int n = sc.nextInt();
		int n1 = n;
		int given = n;
		double sum = 0;
		int digit = 0;
		while (n1 > 0) {
			n1 = n1 / 10;
			digit++;
		}
		while (n > 0) {
			int d = n % 10;
			sum = sum + Math.pow(d, digit);
			n = n / 10;

		}
		if (sum == given) {
			System.out.println("Given number is Amstrong number");
		} else {
			System.out.println("Given number is not a Amstrong number");
		}
	}
}
