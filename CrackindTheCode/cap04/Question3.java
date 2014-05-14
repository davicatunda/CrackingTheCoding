package cap04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class BinaryTree {
	public BinaryTree left;
	public BinaryTree right;
	int value;

	public BinaryTree(int value, BinaryTree left, BinaryTree right) {
		this.value = value;
		this.left = left;
		this.right = right;
	}
}

public class Question3 {
	static BinaryTree toMinBinaryTree(ArrayList<Integer> list) {
		BinaryTree tree = null;
		
		for (int i = 1; i <= list.size(); i = i * 2) {
			tree = new BinaryTree(list.get(i - 1), tree, null);
			if (i != 1){
				ArrayList<Integer> a = new ArrayList<Integer>();
				int end = 2 * i - 2;
				if(end >= list.size())
					end = list.size()-1;
				a.addAll(list.subList(i, end+1));
				tree.right = toMinBinaryTree(a);
			}
		}

		return tree;
	}

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6,7,8));
		BinaryTree tree = toMinBinaryTree(list);
		Queue<BinaryTree> queue = new LinkedList<BinaryTree>();
		queue.add(tree);

		while (!queue.isEmpty()) {
			BinaryTree aux = queue.remove();
			System.out.print(aux.value + " ");
			if (aux.right != null)
				queue.add(aux.right);
			if (aux.left != null)
				queue.add(aux.left);
			System.out.print("...");
		}

	}

}
