package cap01;

import java.util.Stack;

public class Question2 {
	/*
	 * Reverse a string
	 */
	public String reverse(String str){
		Stack<Character> stack = new Stack<Character>();
		
		StringBuffer reverseStr = new StringBuffer();
		int lenght =str.length();
		for(int i = 0; i < lenght; i++ ){
			stack.push(str.charAt(i));
		}
		for(int i=0;i<lenght;i++){
			reverseStr.append(stack.pop());
		}
		return reverseStr.toString();
	}
}
