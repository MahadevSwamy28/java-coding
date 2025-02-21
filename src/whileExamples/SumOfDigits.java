/*
 * this program finds sum of digits
 */

package whileExamples;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the number");
		int n = sc.nextInt();
		int result = sumOfDigit(n);
		System.out.println(result);

	}

	private static int sumOfDigit(int n) {

		int sum =0;
		int d;
		
		while(n!=0) {
			d = n%10;
			sum += d;
			n = n/10;
		}
		
		return sum;
	}

}
