/*
 * most consecutively repeated element in array like ( 1,1,1,1,1,2,3,2,2,3) here 1 repeated 5 time continuosly
 */

package arraysExamples;

public class Example8 {

	public static void main(String[] args) {

		int[] arr = {1,2,2,2,1,1,1,1,4,2,3};
		
		consecutivelyRepeated(arr);
		
	}

	private static void consecutivelyRepeated(int[] arr) {

		int c = 0; 
		int x = 0;
		
		for(int i = 0; i<arr.length-1; i++) {
			
			int count = 0;
			
			for(int j = i+1; j<arr.length; j++) {
				
				if(arr[i] == arr[j]) {
					count++;
				}else {
					break;
				}
				
			}
				if(count > c) {
					c = count;
					x = arr[i];
				}
				
			}
			System.out.println(x + "consecutively repeated "+ (c + 1) + " times");	
		
		
	}

}
