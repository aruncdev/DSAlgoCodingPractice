package searching;

public class PeakElement {

	public static void main(String[] args) {
		int[] nums = new int[] {5, 4, 3, 2, 1};
		
		System.out.println(findPeakElement(nums, 0, nums.length - 1));

	}

	public static int findPeakElement(int[] nums, int start, int end) {
		int mid = start + (end - start) / 2;
		if ((mid == 0 || nums[mid-1] <= nums[mid]) && (mid == nums.length - 1 || nums[mid] >= nums[mid + 1])) {
			return mid; 
		}
		else if(nums[mid - 1] > nums[mid]) {
			return findPeakElement(nums, start, mid - 1);
		}
		else {
			return findPeakElement(nums, mid + 1, end);
		}
	}
}
