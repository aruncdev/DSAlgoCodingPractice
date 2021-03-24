package sorting;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		//compare 2 adjacent elements and order them accordingly
		int[] arr = new int[] {2, 5, -2, 6, -3, 8, 0, -7, -9, 4 };
		
		System.out.println("Before sorting: " + Arrays.toString(arr));
		int swaps = 0;
		
		for(int i = 0; i < arr.length; i++) {
			swaps = 0;
			for(int j = 0; j < arr.length - i; j++) {
				if(j < arr.length - 1 && arr[j] > arr[j + 1]) {
					int curr = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = curr;
					swaps++;
				}
			}
			if(swaps == 0)
				break;
		}
		
		System.out.println("After sorting: " + Arrays.toString(arr));
	}

}

//Worst case: O(N * N).  Best case: O(N). In general: O (N * N)