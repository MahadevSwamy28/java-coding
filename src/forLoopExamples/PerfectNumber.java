/*
 * this program finds perfect numbers , after adding divisor number should be same.
 * example : 6 = 1+2+3 = 6 
 *          28 = 1+2+4+6+7+14 = 28
 */

package forLoopExamples;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter The Number");
		int n = sc.nextInt();
		checkPerfect(n);
	}

	private static void checkPerfect(int n) {

		if (n <= 1) {
			System.out.println(n + " is not a perfect number");
			return;
		}

		int sum = 0;

		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) 
				sum += i;
		}

		if (sum == n) {
			System.out.println(n + " is a perfect number");
		} else {
			System.out.println(n + " is not a perfect number");
		}

	}

}
