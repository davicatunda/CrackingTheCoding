package cap03;

import java.util.Arrays;
import java.util.Stack;

public class Question6 {

	static Stack<Integer> sortStack(Stack<Integer> stack) {
		Stack<Integer> aux = new Stack<Integer>();
		int value;
		if (stack.isEmpty())
			return null;
		aux.push(stack.pop());

		while (!stack.isEmpty()) {
			if (stack.peek() < aux.peek()) {
				value = stack.pop();
				while(aux.peek()>value){
					stack.push(aux.pop());
					if(aux.isEmpty())
						break;
				}
				aux.push(value);
			} else {
				aux.push(stack.pop());
			}
		}
		return aux;

	}

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.addAll(Arrays.asList(1,2,3,563,1,5,7,6,3,2,5,7));
		System.out.println(stack + "\n"+sortStack(stack));

	}

}
