package Stack;

import java.util.Arrays;
import java.util.Stack;

public class span {

	public static void main(String[] args) {
		// find the previous greater element for the current element, if one exists then span will be curr index - prev largest index
		//if no element exits span will be equal to curr index + 1
		int[] arr = new int[] {13, 15, 12, 14, 16, 8, 6, 4, 10, 30};
		int[] res = new int[arr.length];
		
		Stack<Integer> span = new Stack<>();
		
		for(int i = 0; i < arr.length; i++) {
			if(span.isEmpty()) {
				res[i] = -1;
				span.push(i);
			}
			else if(arr[span.peek()] > arr[i]) {
				res[i] = span.peek();
				span.push(i);
			}
			else {
				while(!span.isEmpty() && arr[span.peek()] < arr[i]) {
					span.pop();
				}
				i--;
			}
		}
		
		for(int i = 0; i < res.length; i++) {
			if(res[i] == -1) {
				res[i] = i + 1;
			}
			else {
				res[i] = i - res[i];
			}
		}
		System.out.println(Arrays.toString(res));
	}

}
