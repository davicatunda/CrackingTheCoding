package cap03;

import java.util.LinkedList;
import java.util.Stack;

class SetOfStacks {
	int threshold = 10;
	LinkedList<Stack<String>> stacks = new LinkedList<Stack<String>>();

	void push() {
		if (!stacks.isEmpty()) {
			if (stacks.remove().size() == threshold) {
				stacks.push(new Stack<String>());
			}
			stacks.remove().push("plate");
		} else {
			stacks.push(new Stack<String>());
			stacks.remove().push("plate");
		}
	}

	void pull() {
		if (stacks.remove().size() == 0)
			stacks.pop();

		if (!stacks.isEmpty())
			stacks.pollLast().pop();

	}

	void popAt(int index) {
		Stack<String> st = stacks.get(index);
		if (st != null) {
			if (st.size() == 0)
				stacks.remove(index);
			if (!stacks.isEmpty())
				st.pop();
		}
	}
}

public class Question3 {

	public static void main(String[] args) {
	}
}
