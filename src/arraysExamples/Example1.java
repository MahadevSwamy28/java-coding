/*
 * This program gives sum
 *  of even and odd numbers of array
 *  separately
 */

package arraysExamples;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
	
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the size of Array");
       int n = sc.nextInt();
       
       int[] arr = new int[n];
       
       for(int i =0; i<n; i++) {
    	   System.out.println("Give the index value of " + i);
    	   arr[i] = sc.nextInt();    	   
       }
       
       findSumAndOdd(arr);		
		 
	}

	private static void findSumAndOdd(int[] arr) {

		int sumEven =0;
		int sumOdd = 0;
		
		for(int i =0; i<arr.length; i++) {
			if(arr[i] % 2 == 0) {
				sumEven += arr[i];
			}else {
				sumOdd += arr[i];
			}
		}
		System.out.println("Sum Even Number " + sumEven);
		System.out.println("Sum Odd Number " + sumOdd);
		
	}
}
