package cap11;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Question5 {
	static boolean isBigger(String one, String two) {
		List<String> both = Arrays.asList(one, two);
		Collections.sort(both);
		if (one == both.get(1))
			return true;
		else
			return false;
	}

	static int findKey(String[] array, String key) {
		int start = 0;
		int end = array.length-1;
		int middle = start + end / 2;
		while (!array[middle].equals(key)) {
			if (end - start < 2) {
				if (array[start].equals(key))
					return start+1;
				if (array[end].equals(key))
					return end+1;
				return -1;
			}
			middle = (start + end) / 2;
			int middleTop = middle;
			int middleBottom = middle;
			while (array[middle].equals("")) {
				middleTop++;
				middle = middleTop;
				if (array[middleTop].equals("")) {
					middleBottom--;
					middle = middleBottom;
				}
			}

			if (isBigger(array[middle], key)) {
				end = middleBottom;
			} else {
				start = middleTop;
			}
		}

		return middle + 1;
	}

	public static void main(String[] args) {
		String[] array = new String[] { "a1", "", "b3", "", "c5", "d6", "", "",
				"e9", "f10", "", "", "", "g14", "", "", "h17" };
		System.out.println(findKey(array, "a1"));
		System.out.println(findKey(array, "b3"));
		System.out.println(findKey(array, "c5"));
		System.out.println(findKey(array, "d6"));
		System.out.println(findKey(array, "e9"));
		System.out.println(findKey(array, "f10"));
		System.out.println(findKey(array, "g14"));
		System.out.println(findKey(array, "h17"));
		System.out.println(findKey(array, "jasuisa"));
	}
}
