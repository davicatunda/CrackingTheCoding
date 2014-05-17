package cap02;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Question4 {
	static void partition (int x, List<Integer> list){
		List<Integer> less = new LinkedList<Integer> ();
		List<Integer> more = new LinkedList<Integer> ();
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
		List<Integer> list = new LinkedList<Integer> ();
		list.addAll(Arrays.asList(1,9,3,15,4,-2,10,10,0));
		partition(10,list);
	}

}
