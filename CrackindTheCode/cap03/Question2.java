package cap03;

class Node {
	Node next;
	int data;
	Node(int data) {
		this.data = data;
	}
}

/*
 * I would create a extra Stack that on the top has a copy of the min element,
 * and when I were to add a element that is smaller or equal than the top I
 * would add it in this top as well. When removing it would be necessary to
 * check if the element is the top of the minStack, to conserve its propertie.
 */
// this is Question 3.2, push, pop, min in a stack with O(1) in time
public class Question2 {
	Node top, min;

	void push(int data) {
		if (top == null) {
			top = new Node(data);
			min = top;
		} else {
			top.next = new Node(data);
			top = top.next;
			if (data < min.data) {
				min.next = min;
				min = top;
			}
		}
	}

	int pop() {
		int value;
		if (top != null) {
			value = top.data;
			if (min.data == value)
				min = min.next;
			top = top.next;
			return value;
		}
		return Integer.MIN_VALUE;
	}

	// returns Min Value from Stack in O(1) in time
	int getMinValue() {
		return min.data;
	}
}
