package cap04;

import utils.BinaryTreeNode;

//Implement a function to check if a binary tree is balanced. For the purposes of
//this question, a balanced tree is defined to be a tree such that the heights of the
//two subtrees of any node never differ by more than one
public class Question1<T> {
	int auxHeight = 0;
	int minLeafHeight = 0;
	int numberOfLeafs = 0;

	public boolean treeIsBalanced(BinaryTreeNode<T> node) {
		if (node == null) {
			switch (numberOfLeafs) {
			case 2:
				if (auxHeight != minLeafHeight
						&& auxHeight != minLeafHeight + 1)
					return false;
			case 1:
				if (minLeafHeight != auxHeight) {
					if (minLeafHeight == auxHeight + 1) {
						minLeafHeight = auxHeight;
					} else if (minLeafHeight != auxHeight - 1) {
						return false;
					}
					numberOfLeafs++;
				}
				break;
			case 0:
				numberOfLeafs++;
				minLeafHeight = auxHeight;
				break;
			}
		} else {
			auxHeight++;
			if (!treeIsBalanced(node.left))
				return false;
			if (!treeIsBalanced(node.right))
				return false;
			auxHeight--;
		}
		return true;
	}
}
