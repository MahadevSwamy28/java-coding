package NestedForLoopExamples;

import java.util.Scanner;

public class Example5 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int n = sc.nextInt();	
		printAngles(n);	
				
	}

	private static void printAngles(int n) {

		
		for(int i=n-1; i>=0; i--) {
			for(char ch = 'A'; ch<='A'+i; ch++) {
				System.out.print(ch+" ");
			}
			System.out.println();
		}
	}

}
