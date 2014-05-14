package utils;

public class BinarySearchTree extends BinaryTree<Integer>{
	
	public BinarySearchTree(BinaryTreeNode<Integer> root) {
		super(root);
	}

	/*
	 * returns the last Node when searching for an element
	 */
	public boolean search(int value){
		BinaryTreeNode<Integer> runner = root;
		if(root!=null)
			while(runner.value!=value){
				if(value > runner.value){
					if(runner.right!=null){
						runner=runner.right;
					} else return false;
					
				} else if(value < runner.value){
					if(runner.left!=null){
						runner=runner.left;
					} else return false;
				}
			}
		return true;
	}
		
			
	public boolean remove (int value, BinaryTreeNode<Integer> head){
		//if sub-tree is empty
		if(head==null) return false;
		
		if(head.value==value){
			if(root.value==value) root=null;
			return remove(value, root);
		}
		BinaryTreeNode<Integer> runner = head, parent= head;

		//walk until reach node to be removed
		while(runner.value!= value){
			parent=runner;
			if(value > runner.value)
				if(runner.right!=null){
					runner=runner.right;
				}
				else return false;
			else
				if(runner.left!=null){
					runner=runner.left;
				}
				else return false;
		}
		
		
			
		int r = findSmallest(runner);
		
		//has 2 children
		if(runner.left != null && runner.right!=null){
			remove(r, runner.right);
			runner.value=r;
		} 
		else{
			//leaf node
			if(runner.left == null && runner.right==null) 
				runner=null;
			//no right child
			else if(runner.right==null)
				runner=runner.left;
			//no left child
			else if(runner.left==null)
				runner=runner.right;
			
			if(parent.left.value==value) parent.left = runner;
			else parent.right = runner;
		}
		return true;
	}
	
	/*
	 * find smallest right child from a node, returning itself if there is none
	 */
	public int findSmallest(BinaryTreeNode<Integer> node){
		if(node.right==null) return node.value;
		node = node.right;
		while(node.left!=null) node=node.left;
		return node.value;
	}
	
		
	
	/*
	 * add a node with a determined value
	 */
	public boolean add (int value){
		BinaryTreeNode<Integer> runner = root;
		runner.value=value;
		
		//if sub-tree is empty
		if(root==null){
			root = new BinaryTreeNode<Integer>(value);
			return true;
		}
		//walk until reach the place to add the node
		while(runner.value!= value){
			if(value > runner.value)
				if(runner.right!=null){
					runner=runner.right;
				}
				else runner.right = new BinaryTreeNode<Integer>(value);
			else
				if(runner.left!=null){
					runner=runner.left;
				}
				else runner.left = new BinaryTreeNode<Integer>(value);;
		}
		
		return true;
	}
	
}
