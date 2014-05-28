package cap11;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import javax.swing.text.MaskFormatter;

public class Question2 {
	static void sortAnagrams(List<String> list) {
		HashMap<String, List<String>> map = new HashMap<String, List<String>>();
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			String temp = iterator.next();
			char[] chars = temp.toCharArray();
			Arrays.sort(chars);
			String sorted = String.valueOf(chars);
			if (!map.containsKey(sorted)) {
				map.put(sorted, new LinkedList<String>());
			}
			map.get(sorted).add(temp);
		}
		list.clear();
		Iterator<List<String>> mapIterator = map.values().iterator();
		while (mapIterator.hasNext()) {
			list.addAll(mapIterator.next());
		}

	}

	static void sortAnagrams(String[] list) {
		HashMap<String, List<String>> map = new HashMap<String, List<String>>();
		for (String temp : list) {
			char[] chars = temp.toCharArray();
			Arrays.sort(chars);
			String sorted = String.valueOf(chars);
			if (!map.containsKey(sorted)) {
				map.put(sorted, new LinkedList<String>());
			}
			map.get(sorted).add(temp);
		}
		Iterator<List<String>> mapIterator = map.values().iterator();
		int i = 0;
		while (mapIterator.hasNext()) {
			for (String temp : mapIterator.next())
				list[i++] = temp;
		}

	}

	public static void main(String[] args) {
		List<String> linkedList = new LinkedList<String>();
		linkedList.addAll(Arrays.asList("a", "ab", "ba", "aa", "bb", "abc", "acb",
		"cba", "cab"));
		
		String[] list = { "a", "ab", "ba", "aa", "bb", "abc", "acb", "cba",
				"cab" };
		Collections.shuffle(linkedList, new Random(System.nanoTime()));
		
		for (String temp : list)
			System.out.print(temp + " ");
		
		sortAnagrams(list);
		sortAnagrams(linkedList);
		
		System.out.println();
		for (String temp : list)
			System.out.print(temp + " ");
		System.out.println();
		System.out.println(linkedList);

	}

}
