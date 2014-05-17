package cap02;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Question1 {
	public static void removeDuplicates(List<Integer> list) {
		Iterator<Integer> a = list.iterator();
		Set<Integer> map = new HashSet<Integer>();
		while (a.hasNext()) {
			if(!map.add(a.next()))
				a.remove();
		}
	}

	public static List<Integer> removeDuplicatesWithSort(List<Integer> list) {
		List<Integer> noDuplicatesList = new LinkedList<Integer>();
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
		List<Integer> list = new LinkedList<Integer>();
		list.addAll(Arrays.asList(1,1,3,2,4,1));
		System.out.println(list);
		removeDuplicates(list);
		System.out.println(list);
	}
}
