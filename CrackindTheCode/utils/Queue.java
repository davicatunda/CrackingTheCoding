package utils;

public class Queue<T> {
	Node<T> first, last;
	
	public void enqueue(T value){
		Node<T> n = new Node<T>(value);
		if(last==null){
			first=n;
			last=n;
		} else{
			n.next = last;
			last = n;
		}
	}
	public T dequeue(){
		T value=null;
		Node<T> runner = last;
		if(first==null)return null;
		else{
			if (runner.next==null){
				value=first.value;
				first = null;
				last = null;
			} else{
				while(runner.next.next!=null){
					runner=runner.next;
				}
				value=runner.next.value;
				runner.next=null;
				first=runner;
			}
		}
		
		return value;
	}
	
	public String toString(){
		String str="";
		if(first==null) str="vazio";
		else{
			Node<T> runner= last;
			while (runner!=null){
				str += runner.value +" ";
				runner=runner.next;
			}
		}
		return str;
	}
}
