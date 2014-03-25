package tests;
import utils.LinkedList;


public class LinkedList_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list = new LinkedList<Integer>();
		System.out.println(list);
		list.appendToHead(1);System.out.println(list);
		list.appendToHead(2);System.out.println(list);
		list.appendToHead(3);System.out.println(list);
		list.appendToTail(4);System.out.println(list);
		list.appendToN(10, 3);System.out.println(list);
		list.removeHead();System.out.println(list);
		list.removeTail();System.out.println(list);
		list.removeN(2);System.out.println(list);

	}

}
