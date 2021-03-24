package Debugging;

import java.util.*;


public class MaxRectangleInHistogram {

	public static void main(String[] args) {
		int[] heights = new int[] {2, 1 ,5,6,2,3};
		int[] leftMax = new int[heights.length];
//        int[] rightMax = new int[heights.length];
        
        Stack<Integer> stack = new Stack<>();
        
        for(int i = 0; i < heights.length; i++){
            if(stack.isEmpty()) {
                leftMax[i] = i;
            } else if(heights[stack.peek()] > heights[i]) {
                while(!stack.isEmpty() && heights[stack.peek()] > heights[i]){
                	leftMax[i] = stack.pop();
                }
            } else {
//                stack = new Stack<>();
                leftMax[i] = i;
            }
            stack.push(i);
        }
        
        System.out.println(Arrays.toString(leftMax));
        

	}

}
