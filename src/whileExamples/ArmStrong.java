/*
 * this program finds armstrong number or not
 * 
 * example: 153 ->  3  3  3
 *                 1  5  3  = 153 
 */

package whileExamples;

import java.util.Scanner;

public class ArmStrong {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = sc.nextInt();
		boolean flag = checkArmStrong(n);
		
		if(flag == true) {
			System.out.println(n + " is armstrong number");
		}else {
			System.out.println(n + " is not armstrong number");
		}

	}

	private static boolean checkArmStrong(int n) {

		String str = String.valueOf(n);
		int len = str.length();

		int sum = 0;
		int temp = n;
		int d;

		while (n != 0) {
			d = n % 10;
			sum = sum + (int) Math.pow(d, len);
			n = n / 10;
		}
		if (sum == temp) {
			return true;
		} else {

			return false;
		}
	}
}
