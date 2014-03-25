package utils;

class Array<T>{
	T value;
	
	public Array (T value){
		this.value=value;
	}
}

public class ArrayList<T> {
	Array<T>[] arrays;
	int n;
		
	public ArrayList(T value){
		arrays = new Array[1];
		arrays[0] = new Array<T>(value);
		n=1;
	}
	public ArrayList(){
		arrays = new Array[10];
	}
	
	//Appends the specified element to the end of this list.
	void add(T value){
		if(n==arrays.length){
			Array<T>[] newArray = new Array[2*n];
			for (int i = 0; i< arrays.length;i++) newArray[i]=arrays[i];
			arrays= newArray;
		}
		arrays[n]=new Array<T>(value);
		n++;
		return;
	}
	
	//Inserts the specified element at the specified position in this list.
	boolean add(int index, T value){
		if(index>n) return false;
		else{
			if(n==arrays.length){
				Array<T>[] newArray = new Array[2*n];
				for (int i = 0, j = 0; i< arrays.length;i++,j++) {
					if(i==index){
						newArray[j]= new Array<T>(value);
						j++;
					}
					newArray[j]=arrays[i];
				}
				arrays= newArray;
			}
		}
		return true;
		
	}
	//Returns the element at the specified position in this list.
	T get(int index){
		if (index>n) return null;
		return arrays[index].value;
	}
	
	//Removes the element at the specified position in this list.
	T remove(int index){
		if(index>n) return null;
		T value = arrays[index].value;
		for(int i=index; i<n; i++){
			arrays[i]=arrays[i+1];
		}
		return value;
	}
	
	//Removes the first occurrence of the specified element from this list, if it is present.
	boolean	remove(T value){
		boolean exist=false;
		int i;
		for(i=0; i<n; i++){
			if(arrays[i].value==value){ 
				exist = true;
				break;
			}
		}
		if(exist){
			while(i<n){
				arrays[i]=arrays[i+1];
				i++;
			}
			return true;
		}
		return false;
	}
	
	
}
