package tests;

import java.util.ArrayList;

public class ArrayList_Test {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println(list);
		list.add(3, 4);
		System.out.println(list);
		
		
	}

}
