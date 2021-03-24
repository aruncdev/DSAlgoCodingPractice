package Debugging;

import java.util.Arrays;

public class SubsetSum {

	public static void main(String[] args) {
		int[] nums = new int[] {2, 3, 5, 6, 8, 10};
		int target = 8;
		
		int[][] dp = new int[nums.length + 1][target + 1];
		
		for(int i = 0; i < dp.length; i++)
			dp[i][0] = 1;
		
		for(int i = 1; i < dp.length; i++) {
			for(int j = 1; j < dp[i].length; j++) {
				if(nums[i - 1] <= j) {
					dp[i][j] = dp[i - 1][j] + dp[i - 1][j - nums[i - 1]];
					// dp[i - 1][j] => excluding
					//dp[i - 1][j - nums[i - 1] => including
				} else {
					dp[i][j] = dp[i - 1][j];
				}
			}
		}
		
		for(int i = 0; i < dp.length; i++) {
			System.out.println(Arrays.toString(dp[i]));
		}
		
		System.out.println(dp[nums.length][target]);
	}

}
