package sorting;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int[] arr = new int[] {2, 5, -2, 6, -3, 8, 0, -7, -9, 4, 2};
		
		System.out.println("Before sorting: " + Arrays.toString(arr));
		
		sort(arr, 0, arr.length - 1);
		
		System.out.println("After sorting: " + Arrays.toString(arr));
	}
	
	public static void sort(int[] arr, int start, int end) {
		
	}

}
