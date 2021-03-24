package twoPointer;

public class twoSumSortedArray {

	public static void main(String[] args) {
		int[] arr = new int[] {2, 4, 8, 9, 11, 12, 20, 30};
		int target = 18, start = 0, end = arr.length - 1;
		boolean found = false;
		
		while(start < end) {
			int sum = arr[start] + arr[end];
			
			if(sum == target) {
				System.out.println("Found the pair!!! " + arr[start] + " " + arr[end]);
				found = true;
				break;
			}
			else if(sum > target) {
				end--;
			}
			else {
				start++;
			}
		}
		
		if(!found) {
			System.out.println("Pair not found!!!");
		}
	}

}
