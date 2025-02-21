package forLoopExamples;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter The Number of terms in fibonacci series");
		int n = sc.nextInt();

		if (n <= 0) {
			System.out.println("Please enter a positive number.");
		} else {
			fibonacciCheck(n);
		}

		sc.close();
	}

	private static void fibonacciCheck(int n) {

		int firstTerm = 0;
		int SecondTerm = 1;

		System.out.print(firstTerm + "  " +  SecondTerm + "  ");

		for (int i = 3; i <= n; i++) {
			int nextTerm = firstTerm + SecondTerm;
			System.out.print(nextTerm + "  ");
			firstTerm = SecondTerm;
			SecondTerm = nextTerm;
		}

	}

}
