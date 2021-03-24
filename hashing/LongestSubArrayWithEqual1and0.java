package hashing;

import java.util.HashMap;

public class LongestSubArrayWithEqual1and0 {

	public static void main(String[] args) {
		//same as subarray sum = 0 in this we need change all 0's to -1's 
		int[] arr = new int[] {1, 1, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1};
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == 0) {
				arr[i] = -1;
			}
		}
		
		int start = 0, end = 0, sum = 0, max = 0;
		boolean found = false;
		HashMap<Integer, Integer> map = new HashMap<>();
		
		map.put(0, -1);
		
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
			
			if(map.containsKey(sum)) {
				found = true;
				start = map.get(sum);
				end = i;
				max = Math.max(max, end - start); 
			}
			else {
				map.put(sum, i);
			}
		}
		
		if(found) {
			System.out.println("Max size: " + max + " start: " + start + " end: " + end);
		}
		else {
			System.out.println("Does not exist");
		}
	}

}
