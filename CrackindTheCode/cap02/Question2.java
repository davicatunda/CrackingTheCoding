package cap02;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Question2 {

	public static int getkToLast(List<Integer> list, int k) {
		Iterator<Integer> runner1 = list.listIterator();
		Iterator<Integer> runner2 = list.listIterator();
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
		List<Integer> list = new LinkedList<Integer>();
		list.addAll(Arrays.asList(1,2,3,4,5,6));
		System.out.println(getkToLast(list, 2));
	}

}
