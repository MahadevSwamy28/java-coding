/*
 * this program removes duplicate element from an array
 */

package arraysExamples;

import java.util.Arrays;

public class Example4 {

	public static void main(String[] args) {

		int[] arr = {2,6,4,2,6,3,3,6,7,8};

			removeDuplicateElement(arr);
		
	}

	private static void removeDuplicateElement(int[] arr) {


		if (arr == null || arr.length == 0) {
			System.out.println("Array is null");
			return;
		}
		if (arr.length == 1) {
			System.out.println("Array has only one element "+ arr[0]);
			return;
		}
		
		Arrays.sort(arr);
		int i =0;		
		
		
		for(int j = 1; j<arr.length; j++) {
			if(arr[i] != arr[j]) {
				i++;
				arr[i] = arr[j];
			}
		}
		
		for(int k = 0; k<=i; k++) {
		
		System.out.print(arr[k]+ " ");
	}
	}
}
