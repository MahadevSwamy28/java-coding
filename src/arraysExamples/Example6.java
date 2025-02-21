/*
 * binary search
 */

package arraysExamples;

import java.util.Arrays;

public class Example6 {

	public static void main(String[] args) {

		int[] arr = { 20, 24, 46, 67, 89 };
		int k = 90;
		binarySearch(arr, k);

	}

	private static void binarySearch(int[] arr, int k) {

		Arrays.sort(arr);

		int low = 0;
		int high = arr.length - 1;

		boolean found = false;

		while (low <= high) {

			int mid = (low + high) / 2;

			if (k == arr[mid]) {
				found = true;
				break;
			} else if (k > arr[mid]) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		if (found == true) {
			System.out.println("Element found");
		} else {
			System.out.println("Element not found");
		}

	}

}
