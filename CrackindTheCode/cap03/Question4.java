package cap03;

import java.io.IOException;
import java.util.Arrays;
import java.util.Stack;

public class Question4 {
	static void solveHannoi(Stack<Integer> tower1, Stack<Integer> tower2,
			Stack<Integer> tower3, int n) {
		if (n == 1) {
			move(tower1, tower3);
			return;
		}

		solveHannoi(tower1, tower3, tower2, n - 1);
		move(tower1, tower3);
		if (!tower2.isEmpty())
			solveHannoi(tower2, tower1, tower3, n - 1);
	}

	static void move(Stack<Integer> source, Stack<Integer> destiny) {
		try {
			destiny.push(source.pop());
		} catch (Exception e) {
			System.out.println(source + "error" + destiny);
		}
	}

	public static void main(String[] args) {
		Stack<Integer> tower1 = new Stack<Integer>();
		tower1.addAll(Arrays.asList(6, 5, 4, 3, 2, 1));
		Stack<Integer> tower2 = new Stack<Integer>();
		Stack<Integer> tower3 = new Stack<Integer>();
		System.out.println(tower1 + "" + tower2 + "" + tower3);
		solveHannoi(tower1, tower2, tower3, tower1.size());
		System.out.println(tower1 + "" + tower2 + "" + tower3);
	}

}
