package NestedForLoopExamples;

import java.util.Scanner;

public class Example6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int n = sc.nextInt();	
		printAngles(n);	
		
	}

	private static void printAngles(int n) {

		int start;
		
		for(int i=0; i<n; i++) {
			if(i%2==0) {
				start=1;
			}else {
				start=0;
			}
			for(int j =0; j<=i; j++) {
				System.out.print(start+" ");
				start= 1-start;
			}
			System.out.println();
		}
		
	}

}
