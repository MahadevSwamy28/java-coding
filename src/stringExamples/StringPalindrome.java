package stringExamples;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();

		checkPalindrome(str);

		sc.close();
	}

	private static void checkPalindrome(String str) {

		boolean flag = true;
		int j = str.length() - 1;
		for (int i = 0; i <= str.length() / 2; i++, j--) {
			if (str.charAt(i) != str.charAt(j)) {
				flag = false;
				break;
			}
		}

		if (flag == true) {
			System.out.println("It is palindrome");
		} else {
			System.out.println("It is not a palindrome");
		}

	}

}
