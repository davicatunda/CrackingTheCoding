package cap01;

import java.util.Deque;
import java.util.LinkedList;

public class Question2 {
	/*
	 * Reverse a string
	 */
	public String reverse(String str){
		Deque<Character> stack = new LinkedList<Character>();
		
		StringBuffer reverseStr = new StringBuffer();
		int lenght =str.length();
		for(int i = 0; i < lenght; i++ ){
			stack.addFirst(str.charAt(i));
		}
		for(int i=0;i<lenght;i++){
			reverseStr.append(stack.removeFirst());
		}
		return reverseStr.toString();
	}
}
