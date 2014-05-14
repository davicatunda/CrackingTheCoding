package utils;

public class BinaryTreeNode<T> {
	public BinaryTreeNode<T> left, right;
	public T value;
	
	public BinaryTreeNode(T value, BinaryTreeNode<T> left, BinaryTreeNode<T> right){
		this.value=value;
		this.left=left;
		this.right=right;
	}
	
	public BinaryTreeNode(T value){
		this.value=value;
	}
	
	public String toString(){
		return value+" ";
	}
}
