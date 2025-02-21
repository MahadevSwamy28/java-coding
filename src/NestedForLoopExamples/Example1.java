package NestedForLoopExamples;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();	
		printAngles(n);
	}

	private static void printAngles(int n) {

		for(int i =0; i<n; i++) {
			for(int j =0; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}		
	}
}
