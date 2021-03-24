package Debugging;

import java.util.*;

public class decode {

	public static void main(String[] args) {
		String input = "((ab){3}(cd){2}){2}";
		
		Stack<String> stack = new Stack<>();
		char[] c = input.toCharArray();
		
		for(int i = 0; i < c.length; i++){
		    if(stack.isEmpty() || c[i] == '(') {
		    	stack.push(c[i] + "");
		    } else if(c[i] == ')') {
		    	String temp = "";
		    	while(!stack.isEmpty() && !stack.peek().equals(")") && !stack.peek().equals("(")) {
		    		temp = stack.pop() + temp;
		    	}
		    	stack.push(temp);
		    	stack.push(c[i] + "");
		    } else if(c[i] >= 'a' && c[i] <= 'z') {
		    	String temp = "";
		    	while(!stack.isEmpty() && !stack.peek().equals(")") && !stack.peek().equals("(")) {
		    		temp = stack.pop() + temp;
		    	}
		    	temp = temp + c[i];
		    	stack.push(temp);
		    } else if (c[i] == '{') {
		    	int count = Integer.parseInt(c[i + 1] + "");
		    	i = i + 2;
		    	
		    	String temp = "";
		    	stack.pop();
		    	while(!stack.isEmpty() && !stack.peek().equals(")") && !stack.peek().equals("(")) {
		    		temp = stack.pop() + temp;
		    	}
		    	stack.pop();
		    	String sub = temp;
		    	while(count > 1) {
		    		temp = sub + temp;
		    		count--;
		    	}
		    	stack.push(temp);
		    }
	}
		
		String output = "";
		
		while(!stack.isEmpty()){
		    String temp = stack.pop();
		    
		    if(!(temp.equals("(") || temp.equals(")"))){
		        output = temp + output;
		    }
		}
		
		System.out.println(output);


	}
}
