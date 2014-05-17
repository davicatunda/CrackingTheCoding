package cap03;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class Question6 {

	static Deque<Integer> sortStack(Deque<Integer> stack) {
		Deque<Integer> aux = new LinkedList<Integer>();
		int value;
		if (stack.isEmpty())
			return null;
		aux.push(stack.removeFirst());

		while (!stack.isEmpty()) {
			if (stack.peekFirst() < aux.peekFirst()) {
				value = stack.removeFirst();
				while(aux.peek()>value){
					stack.addFirst(aux.removeFirst());
					if(aux.isEmpty())
						break;
				}
				aux.addFirst(value);
			} else {
				aux.addFirst(stack.removeFirst());
			}
		}
		return aux;

	}

	public static void main(String[] args) {
		Deque<Integer> stack = new LinkedList<Integer>();
		stack.addAll(Arrays.asList(1,2,3,563,1,5,7,6,3,2,5,7));
		System.out.println(stack + "\n"+sortStack(stack));

	}

}
