package cap04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

class Wrapper {
	public BinaryTree node;
	public Integer depth;

	public Wrapper(BinaryTree node, Integer depth) {
		this.node = node;
		this.depth = depth;
	}
}

public class Question4 {
	static HashMap<Integer, LinkedList<Integer>> binaryTreeToLinkedList(
			BinaryTree tree) {
		Queue<Wrapper> queue = new LinkedList<Wrapper>();
		HashMap<Integer, LinkedList<Integer>> map = new HashMap<Integer, LinkedList<Integer>>();
		queue.add(new Wrapper(tree, 0));

		while (!queue.isEmpty()) {
			Wrapper aux = queue.remove();
			if (!map.containsKey(aux.depth))
				map.put(aux.depth, new LinkedList<Integer>());
			map.get(aux.depth).add(aux.node.value);

			if (aux.node.left != null) {
				queue.add(new Wrapper(aux.node.left, aux.depth + 1));
			}
			if (aux.node.right != null) {
				queue.add(new Wrapper(aux.node.right, aux.depth + 1));
			}
		}
		return map;
	}

	static ArrayList<LinkedList<BinaryTree>> binaryTreeToLinkedListBookIdea(
			BinaryTree tree) {
		ArrayList<LinkedList<BinaryTree>> arrayList = new ArrayList<LinkedList<BinaryTree>>();
		LinkedList<BinaryTree> linkedList  = new LinkedList<BinaryTree>();
		linkedList.add(tree);
		
		
		while(linkedList.size()>0){
			arrayList.add(linkedList);//save to array
			LinkedList<BinaryTree> parents  = linkedList;//save parents
			linkedList = new LinkedList<BinaryTree>();//clean list
			for(BinaryTree b: parents){//populate "parents"
				if (b.left != null) {
					linkedList.add(b.left);
				}
				if (b.right != null) {
					linkedList.add(b.right);
				}
			}	
		}
		return arrayList;
	}

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 2, 3,
				4, 5, 6, 7, 8));
		BinaryTree tree = Question3.toMinBinaryTree(list);
		HashMap<Integer, LinkedList<Integer>> map = binaryTreeToLinkedList(tree);
		String response = "";
		for (LinkedList<Integer> a : map.values()) {
			response += "\n" + a;
		}
		System.out.println(response);
	}

}
