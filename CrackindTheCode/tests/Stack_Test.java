package tests;

import utils.Stack;

public class Stack_Test {

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<Integer> ();
					System.out.println(s);
		s.push(1); 	System.out.println(s);
		s.push(2); 	System.out.println(s);
		s.push(3); 	System.out.println(s);
		s.pop(); 	System.out.println(s);
		s.pop(); 	System.out.println(s);
		s.pop(); 	System.out.println(s);
		
	}

}
