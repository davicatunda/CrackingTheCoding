package utils;

public class LinkedList<T> {
	public Node<T> header=null;
	
	public void appendToHead(T value){
		Node<T> start = new Node<T>(value);
		start.next=header;
		header=start;
	}
	
	public void appendToTail(T value){
		Node<T> end = new Node<T>(value);
		Node<T> runner = header;
		if(runner!=null)	while(runner.next!=null)	runner=runner.next;
		else header = end;
		
		runner.next=end;
	}
	public Node<T> getTail(){
		Node<T> runner = header;
		if(runner!=null)	while(runner.next!=null)	runner=runner.next;
		return runner;
	}
	public Node<T> getN(int n){
		Node<T> runner = header;
		for(int i=1;i<n;i++){
			if(runner==null) return null;
			else runner=runner.next;
		}
		return runner;
	}
	
	public boolean appendToN(T value, int n){
		Node<T> nodeN = new Node<T>(value);
		
		if(header==null)
			if(n!=0) return false;
			else{
				header=nodeN;
				return true;
			}
		else{
			Node<T> runner = header;//h,(i=0,r=1)
			for(int i=0;i<n-2;i++){// 0, 1,...n-3, (n-2), X, n-1, n
				if(runner==null) return false;
				else runner=runner.next;
			}
			if(n==0) header = null;
			else if(runner==null) return false;
			else{
				nodeN.next = runner.next;
				runner.next = nodeN;
			}
		}
		return true;
	}
	
	public T removeHead(){
		T value;
		if(header==null) return null;
		else{
			value = header.value;
			header=header.next;
		}
		return value;
	}
	
	public T removeTail(){
		T value;
		
		if(header!=null){
			if(header.next==null) {
				value = header.value;
				header=null;
			}
			else {
				Node<T> runner = header;
				while(runner.next.next!=null) runner=runner.next;
				value=runner.next.value;
				runner.next=null;
			}
		} else value=null;
		
		return value;
	}
	
	public T removeN(int n){
		T value;
		if(header==null) return null;
		else if(header.next==null)
			if(n==0){
				value = header.value;
				header=null;
			} else return null;
		else{
			Node<T> runner = header;
			for(int i=0; i<n-2; i++){
				if(runner==null) return null;
				runner=runner.next;
			}
			if(runner==null||runner.next==null) return null;
			else{
				value=runner.next.value;
				runner.next=runner.next.next;
			}
		}
		return value;
	}
	
	public String toString(){
		String str="";
		Node<T> runner = header;
		if(header==null) str="vazio";
		else
			while(runner!=null) {
				str += runner.value + " ";
				runner=runner.next;
			}
		return str;
	}
	
}

