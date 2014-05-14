package cap09;

import java.util.ArrayList;
//TODO: test
public class Question1 {
	ArrayList<Integer> cache = new ArrayList<Integer>();

	public int howManyWays(int n) {
		int aux;
		if (n == 1)
			return 1;
		if (n == 2)
			return 2;
		if (n == 3)
			return 4;

		if (cache.get(n - 3) == null)
			aux = 4 * howManyWays(n - 3);
		else
			aux = 4 * cache.get(n - 3);
		cache.add(aux);
		return aux;
	}
}
