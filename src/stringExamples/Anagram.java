package stringExamples;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First String");
		String str1 = sc.nextLine();

		System.out.println("Enter the Second String");
		String str2 = sc.nextLine();

		checkAnagram(str1, str2);

	}

	private static void checkAnagram(String str1, String str2) {

		boolean flag = true;

		int len1 = str1.length();
		int len2 = str2.length();

		if (len1 != len2) {
			System.out.println("The two Strings are not anagram");
			return;
		}

		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();

		Arrays.sort(ch1);
		Arrays.sort(ch2);

		for (int i = 0; i < ch1.length; i++) {
			if (ch1[i] != ch2[i]) {
				flag = false;
				break;
			}

		}
		if (flag == true) {
			System.out.println("The two Strings are Anagram");
		} else {
			System.out.println("The two Strings are not Anagram");
		}

	}

}
