package cap04;

import java.util.LinkedList;
import java.util.Queue;

public class Question8 {
	static boolean isSubTree(BinaryTree t1, BinaryTree t2) {
		Queue<BinaryTree> queue = new LinkedList<BinaryTree>();
		queue.add(t1);
		while (!queue.isEmpty()) {
			BinaryTree aux = queue.remove();
			if (aux.left != null)
				queue.add(aux.left);
			if (aux.right != null)
				queue.add(aux.right);

			if (aux.value == t2.value) {
				Queue<BinaryTree> smallerT1 = new LinkedList<BinaryTree>();
				Queue<BinaryTree> queueT2 = new LinkedList<BinaryTree>();
				smallerT1.add(aux);
				queueT2.add(t2);
				boolean b = true;
				while (!smallerT1.isEmpty() || !queueT2.isEmpty()) {
					BinaryTree t1Aux = smallerT1.remove();
					BinaryTree t2Aux = queueT2.remove();
					if (t1Aux.value != t2Aux.value) {
						b = false;
						break;
					}
					if (t1Aux.left != null) {
						smallerT1.add(t1Aux.left);
						queueT2.add(t2Aux.left);
					}
					if (t1Aux.right != null) {
						smallerT1.add(t1Aux.right);
						queueT2.add(t2Aux.right);
					}
				}
				if (b)
					return true;
			}

		}
		return false;
	}

	public static void main(String[] args) {

	}

}
