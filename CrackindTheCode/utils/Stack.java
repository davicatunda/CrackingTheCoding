package utils;

public class Stack<T> {
	Node<T> top;
	
	public T pop(){
		if(top==null) return null;
		T value=top.value;
		top = top.next;
		return value;
	}
	
	public void push(T value){
		Node<T> n = new Node<T>(value);
		n.next = top;
		top = n	;
	}
	
	public T peek(){
		return top.value;
	}
	
	public String toString(){
		String str = new String("");
		if(top==null) return "vazio";
		else{
			Node<T> runner = top;
			while(runner!=null){
				str +=runner.value + " ";
				runner=runner.next;
			}
		}
		return str;
	}
}
