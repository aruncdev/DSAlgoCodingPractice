package hashing;

import java.util.*;

public class SubArrayWithSum0 {

	public static void main(String[] args) {
		//Logic we take the prefix or running sum of the array and then the we have sum till this point 
		//in the variable sum and then we can see in the map if we havd this sum previously.
		//if we had this sum already that means sum from the previous index to current index will be 0.
		int[] arr = new int[] {5, 3, 9, -4, -6, 7, -1};
		HashMap<Integer, Integer> map = new HashMap<>();
		
		map.put(0, 0);
		int sum = 0;
		boolean found = false;
		
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
			if(map.containsKey(sum)) {
				System.out.println("Sub array with sum 0 is from " + (map.get(sum) + 1) + " to " + i);
				found = true;
				break;
			}
			else {
				map.put(sum, i);
			}
		}
		
		if(!found) {
			System.out.println("Sub array with sum 0 is not found");
		}
	}

}
