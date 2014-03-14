package cap3;

class Node{
	Node next;
	int data;
	Node (int data){
		this.data= data;
	}
	
}
//this is Question 3.2, push, pop, min in a stack with O(1) in time
public class StackMin {
	Node top, min;

	void push(int data){
		if(top==null){
			top=new Node(data);
			min=top;
		}
		else{
			top.next = new Node (data);
			top=top.next;
			if(data<min.data){
				min.next=min;
				min=top;
			}
		}
	}
	
	int pop () {	
		int value;
		if(top!=null){
			value = top.data;
			if(min.data==value) min = min.next;
			top = top.next;
			return value;
		}
		return Integer.MIN_VALUE;
	}
	
	//returns Min Value from Stack in O(1) in time
	int getMinValue(){
		return min.data;
	}
}
