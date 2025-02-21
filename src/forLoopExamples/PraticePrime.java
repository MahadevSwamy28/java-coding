package forLoopExamples;

import java.util.Scanner;

public class PraticePrime {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();

		checkPrime(n);

	}

	public static void checkPrime(int n) {

		boolean isPrime = true;

		if (n <= 1) {
			System.out.println(n + " is not a prime number");
			return;
		}
		if (n == 2) {
			System.out.println(n + " is a prime number");
			return;
		}

		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				isPrime = false;
				break;
			}
		}

		if (isPrime == true) {
			System.out.println(n + " is a PrimeNumber");
		} else {
			System.out.println(n + " is not a PrimeNumber");
		}

	}

}
