package utils;

public class BinarySearchTree extends BinaryTree<Integer>{
	
	public BinarySearchTree(BinaryTreeNode<Integer> root) {
		super(root);
	}

	public void add(BinaryTreeNode<Integer> node){
		
	}
	/*
	 * returns the last Node when searching for an element
	 */
	public BinaryTreeNode<Integer> search(int value){
		BinaryTreeNode<Integer> runner = root;
		Integer sValue = value;
		
		while(runner.value!=sValue){
			
			if(sValue > runner.value){
				if(runner.right!=null){
					runner=runner.right;
					continue;
				}
			} else if(sValue < runner.value){
				if(runner.left!=null){
					runner=runner.left;
					continue;
				}
			}
			return runner;
		}
		return runner;
	}

	/*
	 * remove node with a determined value
	 */
	public boolean remove (int value){
		BinaryTreeNode<Integer> lastOnSearch = search(value);
		
		//if tree is empty
		if(lastOnSearch==null)
			return false;
		//if node not found
		if(lastOnSearch.value!=value) 
			return false;

		BinaryTreeNode<Integer> runner = lastOnSearch;
		//left null
		if(runner.left==null){
			if (runner.right==null)	
				lastOnSearch=null;//TODO this is wronga
			else{
				runner.value=runner.right.value;
				runner.right=runner.right.right;
				runner.left=runner.right.left;
			}
		} 
		//left not null
		else{
			if (runner.right==null)
				runner=runner.left;
			//right and left are not null
			else{
				runner=runner.left;
				while(runner.right!=null) runner=runner.left;
				lastOnSearch.value=runner.value;
				runner=null;
			}
		}
		return true;
	}
	
	/*
	 * add a node with a determined value
	 */
	public boolean add (int value){
		BinaryTreeNode<Integer> lastOnSearch = search(value);
		
		if(lastOnSearch!=null){
			if(value == lastOnSearch.value) return false;
			else{
				
			}
		}
		
		return true;
	}
	
}
