package cap11;

public class Question3 {
	static int findKey(int key, int[] array) {
		int start = 0;
		int end = array.length - 1;
		int middle = (start + end) / 2;
		while (array[middle] != key) {
			if (end == start) {
				return -1;
			}
			middle = (start + end) / 2;
			if (array[start] > array[middle]) {
				if (key < array[end] && key > array[middle]) {
					start = middle + 1;
				} else {
					end = middle - 1;
					if (array[end] == key)
						return end + 1;
				}

			} else {
				if (key < array[middle] && key > array[start]) {
					end = middle - 1;
				} else {
					if (array[start] == key)
						return start + 1;
					start = middle + 1;
				}
			}
		}
		return middle + 1;
	}

	public static void main(String[] args) {
		int[] array = new int[] { 7, 9, 1, 2, 3, 5, 6 };
		System.out.println(findKey(1, array));
		System.out.println(findKey(2, array));
		System.out.println(findKey(3, array));
		System.out.println(findKey(4, array));
		System.out.println(findKey(5, array));
		System.out.println(findKey(6, array));
		System.out.println(findKey(7, array));
		System.out.println(findKey(8, array));
		System.out.println(findKey(9, array));
		System.out.println(findKey(10, array));

	}

}
