package Stack;

import java.util.*;

public class ImplementationOfStack {

	public static void main(String[] args) {
		myStack stack = new myStack();
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		
		System.out.println(stack.size());
		System.out.println(stack.pop());
		System.out.println(stack.size());
		System.out.println(stack.isEmpty());
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println(stack.size());
		System.out.println(stack.pop());
		System.out.println(stack.size());
		System.out.println(stack.isEmpty());
	}

}

class myStack{
	
	ArrayList<Integer> list;
	int top = -1;
	
	public myStack() {
		list = new ArrayList<>();
	}
	
	public void push(int val) {
		list.add(val);
		top++;
	}
	
	public int pop() {
		int val = list.get(top);
		list.remove(top);
		top--;
		
		return val;
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public int peek() {
		return list.get(top);
	}
	
	public int size() {
		return list.size();
	}
}
