package cap02;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Question5 {

	static List<Integer> add(List<Integer> op1,
			List<Integer> op2) {
		List<Integer> resp = new LinkedList<Integer>();
		Iterator<Integer> top;
		Iterator<Integer> down;
		if (op1.size() > op2.size()) {
			top = op1.iterator();
			down = op2.iterator();
		} else {
			top = op2.iterator();
			down = op1.iterator();
		}
		int extra = 0;
		boolean cont = true;
		while (top.hasNext()) {
			int value;
			if (cont) {
				value = down.next() + top.next() + extra;
				cont = down.hasNext();
			} else {
				value = top.next() + extra;
			}
			if (value >= 10) {
				extra = 1;
				value = value - 10;
			} else {
				extra = 0;
			}
			resp.add(value);
		}
		if (extra == 1)
			resp.add(1);
		return resp;
	}

	public static void main(String[] args) {
		List<Integer> op1 = new LinkedList<Integer>();
		List<Integer> op2 = new LinkedList<Integer>();
		op1.addAll(Arrays.asList(1,1,9,1,8));
		op2.addAll(Arrays.asList(2,1,1,9));
		System.out.println(op1);
		System.out.println(op2);
		System.out.println(add(op1, op2));
	}

}
