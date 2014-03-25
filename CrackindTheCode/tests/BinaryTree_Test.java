package tests;

import utils.BinaryTree;
import utils.BinaryTreeNode;

public class BinaryTree_Test {
	
	//       1
	//     2   3
	//    4 . 5 .
	

	public static void main(String[] args) {
		BinaryTreeNode<Integer> node5 = new BinaryTreeNode<Integer> (5,null, null);
		BinaryTreeNode<Integer> node4 = new BinaryTreeNode<Integer> (4, null, null);
		BinaryTreeNode<Integer> node3 = new BinaryTreeNode<Integer> (3, node5, null);
		BinaryTreeNode<Integer> node2 = new BinaryTreeNode<Integer> (2, node4, null);
		BinaryTreeNode<Integer> node1 = new BinaryTreeNode<Integer> (1, node2, node3);
		BinaryTree<Integer> tree= new BinaryTree<Integer>(node1);
		tree.BFS(5);// 1->2->3->4->5
		tree.DFS(5);//4->2->5

	}

}
