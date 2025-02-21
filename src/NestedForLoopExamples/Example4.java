package NestedForLoopExamples;

import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int n = sc.nextInt();	
		printAngles(n);	
		
	}

	private static void printAngles(int n) {
		
//		for(int i=0; i<n; i++) {
//			for(int j=65; j<=65+i; j++) {
//				System.out.print((char)j + " ");
//			}
//			System.out.println();
//		}

		for (int i = 0; i < n; i++) {
			for (char ch = 'A'; ch <= 'A' + i; ch++) {
				System.out.print(ch + " ");
			}
			System.out.println();
		}
		
		
	}
}
