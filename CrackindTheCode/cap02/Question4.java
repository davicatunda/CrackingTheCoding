package cap02;

import java.util.Iterator;
import java.util.LinkedList;

public class Question4 {
	static void partition (int x, LinkedList<Integer> list){
		LinkedList<Integer> less = new LinkedList<Integer> ();
		LinkedList<Integer> more = new LinkedList<Integer> ();
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()){
			int value = it.next();
			if(value>=x)
				more.add(value);
			else
				less.add(value);
		}
		less.addAll(more);
		System.out.print(less);
	}

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer> ();
		list.add(1);list.add(9);list.add(3);list.add(15);list.add(4);
		list.add(-2);list.add(10);list.add(10);list.add(0);
		partition(10,list);
	}

}
