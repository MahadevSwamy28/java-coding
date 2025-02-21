/*
 * find the union of two arrays
 */
package arraysExamples;

import java.util.HashSet;

public class Example7 {

	public static void main(String[] args) {

		int[] arr1 = { 3, 5, 6, 2, 6, 10 };
		int[] arr2 = { 1, 9, 7, 4, 5, 8 };

		findUnion(arr1, arr2);

	}

	private static void findUnion(int[] arr1, int[] arr2) {

		HashSet<Integer> set = new HashSet<Integer>();

		for (int i = 0; i < arr1.length; i++) {

			set.add(arr1[i]);
		}

		for (int j = 0; j < arr2.length; j++) {

			set.add(arr2[j]);
		}

		int[] arr3 = new int[set.size()];

		int j = 0;

		for (int x : set) {
			arr3[j] = x;
			j++;
		}

		for (int k = 0; k < arr3.length; k++) {
			System.out.print(arr3[k] + " ");
		}
	}
	

	
	
}