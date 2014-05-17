package cap02;

import java.util.Arrays;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Question7 {
	static boolean isPalindrome(List<Integer> list) {
		if (list == null)
			return false;
		Iterator<Integer> it = list.iterator();
		
		Deque<Integer> stack = new LinkedList<Integer>();
		int n = list.size();

		// 1-2-3-2-1, n = 5 - 2
		// 1-2-3-3-2-1, n = 6 - 3
		for (int i = 0; i < n / 2; i++) {
			stack.add(it.next());
		}
		if (n % 2 == 1)
			it.next();
		for (int i = 0; i < n / 2; i++) {
			if (stack.pop() != it.next())
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		List<Integer> list = new LinkedList<Integer>();
		list.addAll(Arrays.asList(1,2,3,2,1));
		System.out.println(isPalindrome(list));

	}

}
