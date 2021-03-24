package searching;

public class startAnsLastPosition {

	public static void main(String[] args) {
		int[] nums = new int[] {5, 7, 7, 8, 8, 10}, index = new int[]{-1, -1};
		int target = 8;
        
        if(nums.length == 0){
            //stop
        }
        
        int temp = -1, start = 0, end = nums.length - 1;
        
        while(start <= end){
            int mid = start + (end - start) /2;
            
            if(mid >= 1 && nums[mid - 1] < target && nums[mid] == target){
                temp = mid;
                break;
            }
            else if(nums[mid] >= target){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        index[0] = nums[0] != target ? temp : 0;
        start = temp != -1 ? temp : 0;
        end = nums.length - 1;
        
        while(start <= end){
            int mid = start + (end - start) / 2;
            
            if(mid + 1 < nums.length && nums[mid + 1] > target && nums[mid] == target){
                temp = mid;
                break;
            }
            else if(nums[mid] <= target){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        index[1] = nums[nums.length - 1] != target ? temp : nums.length - 1;
        
        System.out.println("Start: " + index[0] + " End: " + index[1]);

	}

}
