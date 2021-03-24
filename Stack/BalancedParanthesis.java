package Stack;

import java.util.*;

public class BalancedParanthesis {

	public static void main(String[] args) {
		String paranthesis = "((())";
		boolean isValid = true;
		
		isValid = checkPar(paranthesis);
		
		if(isValid) {
			System.out.println("Valid paranthesis");
		}
		else {
			System.out.println("Not a valid paranthesis");
		}
	}
	
	public static boolean checkPar(String p) {
		Stack<Character> stack = new Stack<>();
				
		for(int i = 0; i < p.length(); i++) {
			char c = p.charAt(i);
			
			if(c == '(' || c == '{' || c == '[') {
				stack.push(c);
			}
			else {
				if(stack.isEmpty()) {
					return false;
				}
				else if(check(stack.peek(), c) == false) {
					return false;
				}
				else {
					stack.pop();
				}
			}
		}
		
		return stack.isEmpty() == true;
	}
	
	public static boolean check(char a, char b) {
		return (a == '(' && b == ')') || (a == '{' && b == '}') || (a == '[' && b == ']');
	}

}
