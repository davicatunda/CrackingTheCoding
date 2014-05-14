package cap05;

public class Question1 {
	public static int insertInto(int n, int m, int start, int end) {
		int masc = ( (~0)<<(end+1) ) + (1<<start) -1;
		n = n & masc;
		m = m<<start;
		return n | m;
	}

	public static void main(String[] args) {
		System.out.println(insertInto(2048, 19, 2, 6));
	}

}
