package sorting;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		//Human sorting a deck of cards.
		
		int[] arr = new int[] {2, 5, -2, 6, -3, 8, 0, -7, -9, 4 };
		
		System.out.println("Before sorting: " + Arrays.toString(arr));
		
		for(int i = 1; i < arr.length; i++) {
			int cur = arr[i];
			int j = i - 1;
			
			while(j >= 0 && arr[j] > cur) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = cur; 
		}
		
		System.out.println("After sorting: " + Arrays.toString(arr));

	}

}
