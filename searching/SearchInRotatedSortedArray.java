package searching;

public class SearchInRotatedSortedArray {

	public static void main(String[] args) {
		int[] nums= new int[] {1, -3};
		int target = -3;
		
		int end = nums.length - 1, index = findStartIndex(nums, 0, end), start = 0;

		if(nums[index] == target) {
			System.out.println("Traget index: " + index);
		}
		if(nums[index] <= target && nums[end] >= target){
            start = index + 1;
            end = nums.length - 1;
        }
        else{
            start = 0;
            end = index - 1;
        }
		
		while(start <= end) {
			int mid = start + (end - start) / 2;
			
			if(nums[mid] == target) {
				System.out.println("Traget index: " + mid);
				break;
			}
			else if(nums[mid] > target) {
				end = mid - 1;
			}
			else {
				start = start + 1;
			}
		}
	}

	public static int findStartIndex(int[] nums, int start, int end) {
		
		while(start < end) {
			int mid = start + (end - start) / 2;
			
			if(nums[mid] > nums[end]) {
				start = mid + 1;
			}
			else {
				end = mid;
			}
		}
		return start;
	}
}
