package whileExamples;

import java.util.Scanner;

public class NumToWords {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		printWords(num);
	}

	private static void printWords(int n) {

		String words = "";
		while (n != 0) {
			int d = n % 10;

			switch (d) {
			case 0:
				words = "Zero " + words;
				break;

			case 1:
				words = "One " + words;
				break;

			case 2:
				words = "Two " + words;
				break;

			case 3:
				words = "Three " + words;
				break;

			case 4:
				words = "Four " + words;
				break;

			case 5:
				words = "Five " + words;
				break;

			case 6:
				words = "Six " + words;
				break;

			case 7:
				words = "Seven " + words;
				break;

			case 8:
				words = "Eight " + words;
				break;

			case 9:
				words = "Nine " + words;
				break;
			}
			n = n / 10;

		}
		System.out.println(words);

	}

}
