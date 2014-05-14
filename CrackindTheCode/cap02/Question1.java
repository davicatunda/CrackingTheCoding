package cap02;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class Question1 {
	public static void removeDuplicates(LinkedList<Integer> list) {
		Iterator<Integer> a = list.iterator();
		HashSet<Integer> map = new HashSet<Integer>();
		while (a.hasNext()) {
			if(!map.add(a.next()))
				a.remove();
		}
	}

	public static LinkedList<Integer> removeDuplicatesWithSort(LinkedList<Integer> list) {
		LinkedList<Integer> noDuplicatesList = new LinkedList<Integer>();
		Collections.sort(list);
		Iterator<Integer> iter = list.iterator();
		int temp = iter.next();
		noDuplicatesList.add(temp);
		
		while (iter.hasNext()) {
			int aux = iter.next();
			if (aux != temp){
				noDuplicatesList.add(aux);
			}
			temp = aux;
		}
		return noDuplicatesList;
	}

	public static void main(String args[]) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.addAll(Arrays.asList(1,1,3,2,4,1));
		System.out.println(list);
		removeDuplicates(list);
		System.out.println(list);
	}
}
