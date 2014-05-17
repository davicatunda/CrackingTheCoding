package cap11;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Question1 {

	static List<Integer> mergeSortedLists(List<Integer> l1, List<Integer> l2) {
		if(l1.isEmpty())
			return l2;
		if(l2.isEmpty())
			return l1;
		Iterator<Integer> iterator1 = l1.iterator();
		Iterator<Integer> iterator2 = l2.iterator();		
		int aux1 = iterator1.next();
		int aux2 = iterator2.next();
		int temp = (aux1 > aux2) ? aux1 : aux2;
		List<Integer> list = new LinkedList<Integer>();
		list.add((aux1 > aux2) ? aux2 : aux1);
		
		while (iterator1.hasNext()) {
			if (iterator2.hasNext()) {
				// get element in l1 or l2 (choose the one that has not been
				// save in previous loop)
				if (temp == aux1)
					aux2 = iterator2.next();
				else
					aux1 = iterator1.next();
				if (aux1 > aux2) {
					list.add(aux2);
					temp = aux1;
				} else {
					list.add(aux1);
					temp = aux2;
				}
			} else {
				// add all remaining l1 element to list
				if(iterator1.hasNext())
					list.add(temp);
				while (iterator1.hasNext())
					list.add(iterator1.next());
			}

		}
		if(iterator2.hasNext())
			list.add(temp);
		// if l2.hasNext()
		if (iterator2.hasNext()){
			// add all remaining l2 element to list
			while (iterator2.hasNext())
				list.add(iterator2.next());
			}
		return list;
	}

	public static void main(String[] args) {
		List<Integer> list1 = new LinkedList<Integer>();
		List<Integer> list2 = new LinkedList<Integer>();
		list1.addAll(Arrays.asList(1,2,2,4,5));
		list2.addAll(Arrays.asList(2,3,5,9,12,15,16));
		System.out.println(mergeSortedLists(list1, list2));

	}

}
