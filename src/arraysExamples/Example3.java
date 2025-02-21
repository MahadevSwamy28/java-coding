/*
 * This program finds the second largest array element
 * without sorting
 */

package arraysExamples;

import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i =0; i<n; i++) {
			System.out.println("Enter the value index of " + i);
			arr[i] = sc.nextInt();
		}
		
		findSecondLargeOfArray(arr);
	}

	private static void findSecondLargeOfArray(int[] arr) {

		int max1 = arr[0];
		int max2 = arr[0];
		
		for(int i = 1; i<arr.length; i++) {             // 10,20,30,40,50
			
			if(arr[i] > max1) {
			   max2 = max1;
			   max1 = arr[i];
				
			}else if(arr[i] != max1 && arr[i] > max2) {
				max2 = arr[i];
			}
		}
		System.out.println("SECOND LARGEST IS " + max2);
		
	}

}
