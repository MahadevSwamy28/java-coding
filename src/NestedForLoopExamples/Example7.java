package NestedForLoopExamples;

import java.util.Scanner;

public class Example7 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int n = sc.nextInt();	
		printAngles(n);	
		
	}

	private static void printAngles(int n) {
		
		for(int i=0; i<n; i++) {
			for(int j =0; j< 2*(n-i-1); j++) {
				System.out.print(" ");
			}
			for(int k =0; k<=i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}
