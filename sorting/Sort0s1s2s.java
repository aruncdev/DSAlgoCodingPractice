package sorting;

import java.util.Arrays;

public class Sort0s1s2s {

	public static void main(String[] args) {
		// 
		int[] arr = new int[] {0, 1, 2, 2, 1, 0};
		
		System.out.println("Before Sorting: " + Arrays.toString(arr));
		
		sort(arr);
		
		System.out.println("After Sorting: " + Arrays.toString(arr));
	}
	
	public static void sort(int[] arr) {
		int start = 0, mid = 0, high = arr.length - 1;
		
		while(mid <= high) {
			int temp = arr[mid];
			
			if(temp == 0) {
				//swap mid and start
				int swap = arr[mid];
				arr[mid] = arr[start];
				arr[start] = swap;
				start++;
				mid++;
			}
			else if(temp == 1) {
				//continue
				mid++;
			}
			else {
				//swap high and mid
				int swap = arr[mid];
				arr[mid] = arr[high];
				arr[high] = swap;
				high--;
			}
		}
	}

}
