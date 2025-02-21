/*
 * sorting of array without using sort() method.
 */

package arraysExamples;

public class Example2 {

	public static void main(String[] args) {

		int[] arr = { 45, 61, 61, 89, 55, 90 };
		int temp;

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for(int i =0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
