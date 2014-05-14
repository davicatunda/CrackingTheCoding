package cap02;

import java.util.LinkedList;
import java.util.ListIterator;

public class Question2 {

	public static int getkToLast(LinkedList<Integer> list, int k) {
		ListIterator<Integer> runner1 = list.listIterator();
		ListIterator<Integer> runner2 = list.listIterator();
		int count = 1;
		while (runner1.hasNext()) {
			if (count == k + 1)
				runner2.next();
			else
				count++;
			runner1.next();
		}
		return runner2.next();
	}

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		System.out.println(getkToLast(list, 2));
	}

}
