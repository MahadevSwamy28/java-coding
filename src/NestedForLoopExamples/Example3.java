package NestedForLoopExamples;

import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int n = sc.nextInt();	
		printAngles(n);	
	}

	private static void printAngles(int n) {

     int k =1;
     	
     for(int i=0; i<n; i++) {
    	 for(int j =0; j<=i; j++) {
    		 System.out.print(k+" ");
    		 k++;
    	 }
    	 System.out.println();
     }
     		
	}	
}
