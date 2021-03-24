package sorting;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		//Find the max value and then swap the value with the last arr index. Then continue 
		//find second max and swap it with last second arr index and conStinue
		
		int[] arr = new int[] {2, 5, -2, 6, -3, 8, 0, -7, -9, 4};
		
		System.out.println("Before sorting: " + Arrays.toString(arr));
		
		for(int i = 0; i < arr.length; i++) {
			int maxIndex = findiMax(arr, 0, arr.length - 1 - i);
			
			if(maxIndex != arr.length - 1 - i) {
				int curr = arr[maxIndex];
				arr[maxIndex] = arr[arr.length - 1 - i];
				arr[arr.length - 1 - i] = curr;
			}
		}
		System.out.println("After sorting: " + Arrays.toString(arr));
	}

	public static int findiMax(int[] arr, int start, int end) {
		int maxIndex = start;
		
		while(start <= end) {
			if(arr[start] > arr[maxIndex]) {
				maxIndex = start;
			}
			start++;
		}
		return maxIndex;
	}
}

//All cases O(N * N);