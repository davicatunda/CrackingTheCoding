package utils;

public class BinaryTree<T> {
	BinaryTreeNode<T> root;
	T searchValue;
	
	public BinaryTree(BinaryTreeNode<T> root){
		this.root=root;
	}
	
	//Post-order
	public boolean DFS(T value){
		searchValue=value;
		return DFSR(root);
	}
	
	public boolean DFSR(BinaryTreeNode<T> node){
		if(node==null) return false;
		else{
			if(DFSR(node.left)) return true;
			if(DFSR(node.right)) return true;
			System.out.print(node.value);
			if(node.value==searchValue) return true;
		}
		return false;
	}
	
	public boolean BFS(T value){
		Queue<BinaryTreeNode<T>> queue= new Queue<BinaryTreeNode<T>>();
		queue.enqueue(root);
		
		while(queue.first!=null){
			BinaryTreeNode<T> runner= queue.dequeue();
			System.out.print(runner);
			if(runner.value==value) return true;
			if(runner.left!=null) queue.enqueue(runner.left);
			if(runner.right!=null) queue.enqueue(runner.right);
		}
		return false;
	}

	//method to find the next in-order Node
	public BinaryTreeNode<T> nextInOrderNode(BinaryTreeNode<T> node){
		if(node.right!=null){
			BinaryTreeNode<T> runner = node.right;
			while(runner.left!=null){
				runner = runner.left;
			}
			return runner;
		} else{
			BinaryTreeNode<T> old = node;
			BinaryTreeNode<T> runner = node;
			while(old==runner.right){
				if(old.parent!=null){
					old=runner;
					runner=runner.parent;
				}
			}
			return runner;
		}
	}
}
