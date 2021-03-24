package twoPointer;

import java.util.Arrays;

public class threeSumSet {

	public static void main(String[] args) {
		int[] arr = new int[] {-1, 0, 1, 2, -1, -4};
		int n = 0;
		
		Arrays.sort(arr);
		
		for(int i = 0; i < arr.length; i++) {
			int start = i + 1, end = arr.length - 1, target = n - arr[i];
			if(i > 0 && arr[i] == arr[i-1])
                continue;
			
			while(start < end) {
				int sum = arr[start] + arr[end];
				
				if(sum == target) {
					System.out.println("Pair found " + " " + arr[start] + " " + arr[end] + " " + arr[i]);
					while(start + 1 < arr.length && arr[start] == arr[start + 1]) {
						start++;
					}
					while(end - 1 >= 0 && arr[end] == arr[end - 1]) {
						end--;
					}
					start++;
					end--;
				}
				else if(sum > target) {
					end--;
				}
				else {
					start++;
				}
			}
		}

	}

}
