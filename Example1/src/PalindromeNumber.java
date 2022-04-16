import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n, rem, rev = 0;
		System.out.println("Enter the number to check Palindrome");
		n = sc.nextInt();
		int given = n;
		while (n > 0) {
			rem = n % 10;
			rev = (rev * 10) + rem;
			n = n / 10;
		}
		if (given == rev) {
			System.out.println("Given number is a palindrome");
		} else {
			System.out.println("Given number is not a palindrome");
		}

	}
}
