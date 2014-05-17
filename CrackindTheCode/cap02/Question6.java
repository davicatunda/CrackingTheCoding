package cap02;

import utils.LinkedList;
import utils.Node;

public class Question6 {
	
	static Node<Integer> firstNodeInLoop(LinkedList<Integer> list){
		Node<Integer> fastRunner = list.header;
		Node<Integer> slowRunner = list.header;
		if(fastRunner==null)
			return null;
		if(fastRunner.next.next == null)
			return null;
		fastRunner = fastRunner.next.next;
		slowRunner = slowRunner.next;
		
		while(fastRunner!=slowRunner){
			if(fastRunner.next == null)
				return null;
			if(fastRunner.next.next == null)
				return null;
			fastRunner = fastRunner.next.next;
			slowRunner = slowRunner.next;
		}
		slowRunner = list.header;
		while(fastRunner!=slowRunner){
			fastRunner = fastRunner.next.next;
			slowRunner = slowRunner.next;
		}
		return slowRunner;
	}

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		Node<Integer> n1 = new Node<Integer>(1);
		Node<Integer> n2 = new Node<Integer>(2);
		Node<Integer> n3 = new Node<Integer>(3);
		Node<Integer> n4 = new Node<Integer>(4);
		Node<Integer> n5 = new Node<Integer>(5);
		Node<Integer> n6 = new Node<Integer>(6);
		Node<Integer> n7 = new Node<Integer>(7);
		Node<Integer> n8 = new Node<Integer>(8);
		Node<Integer> n9 = new Node<Integer>(9);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		n6.next = n7;
		n7.next = n8;
		n8.next = n9;
		n9.next = n8;
		list.header = n1;
		System.out.println(firstNodeInLoop(list).value);

	}

}
