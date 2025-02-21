/*
 * linear search
 */

package arraysExamples;

import java.util.Arrays;

public class Example5 {

	public static void main(String[] args) {

		int[] arr = { 20, 24, 46, 67, 89 };
		int k = 89;
		linearSearch(arr, k);

	}

	private static void linearSearch(int[] arr, int k) {

		Arrays.sort(arr);

		boolean found = false;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == k) {
				found = true;
				break;
			}
		}
		if (found == true) {
			System.out.println("Element found");
		} else {
			System.out.println("Element not found");
		}
	}

}
