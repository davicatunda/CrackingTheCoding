package interviewedQuestions;

class Node<T>{
	Node<T> next;
	T value;
}

class LinkedList<T>{
	Node<T> head;
}

public class Iterator<T> {
	Node<T> runner;
	Node<T> header;
	
	public boolean hasNext(){
		if(runner== null){
		if (header!=null) return true;
		else return false;
		}
		else{
			if( runner.next==null) return false;
			else return true;
		}
	}

	public T next(){
		if(runner==null){
			if(header==null) return null;
			else{
	runner=header;
	return runner.value;
	}
	} else if(hasNext()){
	runner= runner.next;
			return runner.value;
	} else return null;
	}

	public void remove(){
		if(header==null) return;
		else{
		Node<T> aux=runner;
		next();
		aux.next=aux.next.next;
		}
		return;
	}
	/*Example of using a iterator
	 * 
	 * Iterator I = C.iterator();
	 * while(I.hasNext()){
	 * var value = I.next(); 
	 * //do stuff
	 * }
	 *
	 */
}
