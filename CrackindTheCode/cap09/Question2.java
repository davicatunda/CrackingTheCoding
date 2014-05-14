package cap09;

import java.util.HashMap;

public class Question2 {
	static HashMap<String, Integer> map = new HashMap<String, Integer>();

	public static int howManyPaths(int x, int y) {
		if (x == 1)
			return 1;
		if (y == 1)
			return 1;
		Object obj = map.get(x + "," + y);
		if (obj != null)
			return (int) obj;
		int value = howManyPaths(x - 1, y) + howManyPaths(x, y - 1);
		map.put(x + "," + y, value);
		return value;
	}

	public static void main(String[] args) {
		System.out.println(howManyPaths(30, 20));

	}

}
