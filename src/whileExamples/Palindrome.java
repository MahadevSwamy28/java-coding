/*
 * palindrome number ex: 12321 --- 12321 reveresd same
 */

package whileExamples;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number");
		int n = sc.nextInt();

		boolean flag = checkPalindrome(n);
		if (flag == true) {
			System.out.println(n + " is a palindrome number");
		} else {
			System.out.println(n + " is not a palindrome number");
		}

	}

	private static boolean checkPalindrome(int n) {

		int temp = n;
		int reverse = 0;
		int d;

		while (n != 0) {
			d = n % 10;
			reverse = reverse * 10 + d;
			n = n / 10;
		}
		if (reverse == temp) {
			return true;
		} else {

			return false;
		}
	}
}
