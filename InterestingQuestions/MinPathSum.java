package Debugging;

import java.util.*;

public class MinPathSum {

	public static void main(String[] args) {
		int[][] grid = new int[][] {{1,3,1},{1,5,1},{4,2,1}};
		
		int[][] dp = new int[grid.length][grid[0].length];
        
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                if(i == 0 && j == 0){
                    dp[i][j] = grid[0][0];
                }
                else{
                    int min = Integer.MAX_VALUE;
                    if(i - 1 >= 0){
                        min = Math.min(min, dp[i - 1][j]);
                    }
                    if(j  - 1 >= 0){
                        min = Math.min(min, dp[i][j - 1]);
                    }
                    dp[i][j] = min + grid[i][j];
                }
            }
        }
        
        for(int i = 0; i < dp.length; i++){
            System.out.println(Arrays.toString(dp[i]));
        }
        
        System.out.println("Min Sum = " + dp[grid.length - 1][grid[0].length - 1]);

	}

}
