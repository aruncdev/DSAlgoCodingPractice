package hashing;

import java.util.HashMap;

public class LargestSubArrayWithSumX {

	public static void main(String[] args) {
		//Logic: Same as sum 0, here also we try to use the same logic instead of 0, here we have target
		//element so, we just need to subtract target value from running sum and check if this is present
		//then we will get the subarray with target sum and check all possible cases to find the largest
		//sub array.
		int[] arr = new int[] {-8, 8, 1, -2, -3, -1, 3, -7, -4};
		HashMap<Integer, Integer> map = new HashMap<>();
		
		int target = -8, sum = 0, max = 0, start = 0, end = 0;
		boolean found = false;
		
		map.put(0, -1);
		
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
			if(map.containsKey(sum - target)) {
				found = true;
				int temp = i - map.get(sum - target);
				if(temp > max) {
					start = map.get(sum - target) + 1;
					end  = i;
				}
				max = Math.max(max, temp);
			}
			else {
				map.put(sum, i);
			}
		}
		
		if(found) {
			System.out.println("Max subarray size: " + max + " start: " + start + " end: " + end);
		}
		else {
			System.out.println("No subarray with sum: " + target);
		}

	}

}
