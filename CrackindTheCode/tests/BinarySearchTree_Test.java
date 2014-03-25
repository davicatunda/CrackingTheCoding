package tests;

import utils.BinarySearchTree;
import utils.BinaryTreeNode;

public class BinarySearchTree_Test {
/*        _______________________
 *		 |   ________ .10        |
 * 		 |  |   .5   |     15    |
 * 		 |  | 3    7 |	 12  20  |
 * 		 |  |	  6 8|         21|
 *        ---------------------------
 */
	
	public static void main(String[] args) {
		BinaryTreeNode<Integer> node3 = new BinaryTreeNode<Integer>(3);
		BinaryTreeNode<Integer> node6 = new BinaryTreeNode<Integer>(6);
		BinaryTreeNode<Integer> node8 = new BinaryTreeNode<Integer>(8);
		BinaryTreeNode<Integer> node12 = new BinaryTreeNode<Integer>(12);
		BinaryTreeNode<Integer> node21 = new BinaryTreeNode<Integer>(21);
		BinaryTreeNode<Integer> node20 = new BinaryTreeNode<Integer>(20,null,node21);
		BinaryTreeNode<Integer> node7 = new BinaryTreeNode<Integer>(7, node6, node8);
		BinaryTreeNode<Integer> node5 = new BinaryTreeNode<Integer>(5, node3, node7);
		BinaryTreeNode<Integer> node15 = new BinaryTreeNode<Integer>(15, node12, node20);
		BinaryTreeNode<Integer> node10 = new BinaryTreeNode<Integer>(10, node5, node15);
		
		BinarySearchTree tree = new BinarySearchTree(node5);
//		tree.remove(5, node5);
//		tree.remove(3, node5);
//		tree.remove(7, node5);
//		tree.remove(6, node5);
//		tree.remove(8, node5);
		
//		tree.BFS(22);
		
		tree = new BinarySearchTree(node10);
//		tree.remove(10, node10);
//		tree.remove(5, node10);
//		tree.remove(3, node10);
//		tree.remove(7, node10);
//		tree.remove(6, node10);
//		tree.remove(8, node10);
//		tree.remove(15, node10);
//		tree.remove(12, node10);
		tree.remove(20, node10);
//		tree.remove(21, node10);
		
		tree.BFS(22);

	}

}
