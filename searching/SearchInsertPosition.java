package searching;

public class SearchInsertPosition {

	public static void main(String[] args) {
		int[] nums = new int[] {1, 3, 5, 6};
		int low = 0, high = nums.length - 1, target = 2;
        
        if(nums.length == 0){
            //stop here itself
        }
        
        while(low <= high){
            int mid = low + (high - low) / 2;
            
            if(mid >= 1 && nums[mid - 1] < target && nums[mid] >= target){
                System.out.println(mid);
                break;
            }
            else if(nums[mid] < target){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        if(nums[0] >= target) {
        	System.out.println("0");
        }
        else {
        	System.out.println(nums.length);
        }
	}

}
