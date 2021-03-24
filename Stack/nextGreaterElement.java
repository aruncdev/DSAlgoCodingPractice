package Stack;

import java.util.Arrays;
import java.util.Stack;

public class nextGreaterElement {

	public static void main(String[] args) {
		int[] arr = new int[] {5, 15, 10, 8, 6, 12, 3, 18};
		int[] res = new int[arr.length];
		
		Stack<Integer> span = new Stack<>();
		
		for(int i = arr.length - 1; i >= 0; i--) {
			if(span.isEmpty()) {
				res[i] = -1;
				span.push(i);
			}
			else if(arr[span.peek()] > arr[i]) {
				res[i] = arr[span.peek()];
				span.push(i);
			}
			else {
				while(!span.isEmpty() && arr[span.peek()] < arr[i]) {
					span.pop();
					i++;
				}
			}
		}
		
		System.out.println(Arrays.toString(res));
		
	}

}
