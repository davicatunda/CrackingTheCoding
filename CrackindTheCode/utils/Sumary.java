package utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class Sumary<K, T> {
	K key;
	T value;

	void usingHashMap() {
		// declaring
		Map<K, T> map = new HashMap<K, T>();
		// traverse
		// 1: entry
		for (Map.Entry<K, T> entry : map.entrySet()) {
			entry.getKey();
			entry.getValue();
		}
		// 2: keyset
		for (K temp : map.keySet())
			;
		// add
		map.put(key, value);

		// remove
		map.remove(key);

		// get
		map.get(key);
		// contains
		map.containsKey(key);
	}

	void usingHashSet() {
		// declaring
		Set<T> set = new HashSet<T>();
		// traverse
		// 1:iterator
		Iterator<T> i = set.iterator();
		while (i.hasNext()) {
			T temp = i.next();
		}
		// 2
		for (T temp : set)
			;
		// add
		set.add(value);
		// remove
		set.remove(value);
		// contains
		set.contains(value);
	}

	void usingQueue() {
		// declaring
		Queue<T> queue = new LinkedList<T>();
		// add
		queue.add(value);
		// remove
		queue.remove();
		// get
		value = queue.peek();

	}

	void usingStack() {
		// use as deque in preference to this class
		// declaring
		Stack<T> stack = new Stack<T>();
		// add
		stack.push(value);
		// remove
		stack.pop();
		// get
		stack.peek();
	}

	void usingDeque() {
		// declaring
		Deque<T> deque = new LinkedList<T>();
		// traverse
		Iterator<T> i = deque.iterator();
		while (i.hasNext())
			i.next();
		// add
		deque.addFirst(value);// Stack .push(e)
		deque.addLast(value);// Queue add(e)
		// remove
		deque.removeFirst();// Stack: pop(e), Queue: remove()
		deque.removeLast();//
		// get
		deque.getFirst();// Stack:peek() Queue: peek()
		deque.getLast();
	}

	void usingStringBuffer() {
		// declaring
		StringBuffer buffer = new StringBuffer();
		// add
		buffer.append("a String");
		// return all
		buffer.toString();
	}

	void usingArrayList() {
		// declaring
		ArrayList<T> list = new ArrayList<T>();
		// traverse
		// 1
		Iterator<T> i = list.iterator();
		while (i.hasNext())
			i.next();
		// 2
		for (T temp : list)
			;
		// add
		list.add(value);
		// remove
		list.remove(0);
		// sort
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		Collections.sort(list2);
	}

	void bfs(BinaryTreeNode<Integer> root) {
		Queue<BinaryTreeNode<Integer>> queue = new LinkedList<BinaryTreeNode<Integer>>();
		queue.add(root);
		while (!queue.isEmpty()) {
			BinaryTreeNode<Integer> temp = queue.remove();
			if (temp.left != null)
				queue.add(temp.left);
			if (temp.right != null)
				queue.add(temp.right);
		}
	}

	void dfs(BinaryTreeNode<Integer> root) {
		Stack<BinaryTreeNode<Integer>> stack = new Stack<BinaryTreeNode<Integer>>();
		stack.push(root);
		while (!stack.isEmpty()) {
			BinaryTreeNode<Integer> temp = stack.pop();
			if (temp.right != null)
				stack.push(temp.right);
			if (temp.left != null)
				stack.push(temp.left);
		}
	}

	void usingSortMethods(String string, List<String> collection, MyClass[] myClassArray) {
		// Sorting arrays, on this example chars inside of a String
		char[] array = string.toCharArray(); 
		Arrays.sort(array);
		string = new String(array);
		// Sorting collections
		Collections.sort(collection);
		// Sorting using comparable interface, overriding compareTo()
		// just modify your class like the class above and call Arrays.sort();
		Arrays.sort(myClassArray);
		//or even a collection of it
		Collections.sort(Arrays.asList(myClassArray));
	}
	
	/*
	 * class used to demonstrate method above
	 */
	class MyClass implements Comparable<MyClass> {
		public int n; // for example

		public int compareTo(MyClass comparedElement) {
			return this.n - comparedElement.n; // ascending order
		}
	}
	
}
