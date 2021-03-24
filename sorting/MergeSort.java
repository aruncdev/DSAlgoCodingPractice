package sorting;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int[] arr = new int[] {2, 5, -2, 6, -3, 8, 0, -7, -9, 4, 2};
		
		System.out.println("Before sorting: " + Arrays.toString(arr));
		
		sort(arr, 0, arr.length - 1);
		
		System.out.println("After sorting: " + Arrays.toString(arr));
	}

	public static void sort(int[] arr, int left, int right) {
		if(left < right) {
			int mid = left + (right - left) / 2;
			
			sort(arr, left, mid);
			sort(arr, mid + 1, right);
			
			merge(arr, left, mid, right);
		}
	}
	
	public static void merge(int[] arr, int left, int mid, int right) {
		int leftStart = left, leftEnd = mid;
		int rightStart = mid + 1, rightEnd = right;
		
		int[] leftarr = new int[leftEnd - leftStart + 1];
		int[] rightarr = new int[rightEnd - rightStart + 1];
		
		for(int i = 0; i < leftarr.length; i++) {
			leftarr[i] = arr[leftStart++];
		}
		for(int i = 0; i < rightarr.length; i++) {
			rightarr[i] = arr[rightStart++];
		}
		leftStart = 0;
		rightStart = 0;
		leftEnd = leftarr.length;
		rightEnd = rightarr.length;
		
		while(leftStart < leftEnd && rightStart < rightEnd) {
			if(leftarr[leftStart] <= rightarr[rightStart]) {
				arr[left++] = leftarr[leftStart++];
			}
			else {
				arr[left++] = rightarr[rightStart++];
			}
		}
		
		while(leftStart < leftEnd) {
			arr[left++] = leftarr[leftStart++];
		}
		while(rightStart < rightEnd) {
			arr[left++] = rightarr[rightStart++];
		}
	}
	
}
