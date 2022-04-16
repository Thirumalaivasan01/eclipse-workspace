import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int flag = 0;
		System.out.println("Enter the string to check Palindrome");
		String s = sc.nextLine();
		for (int i = 0, j = s.length() - 1; i < s.length(); i++, j--) {
			if (s.charAt(i) == s.charAt(j)) {
				continue;
			} else {
				flag = 1;
				break;
			}

		}
		if (flag == 1) {
			System.out.println("Given string is not a Palindrome");
		} else {
			System.out.println("Given string is a Palindrome");
		}
	}
}
