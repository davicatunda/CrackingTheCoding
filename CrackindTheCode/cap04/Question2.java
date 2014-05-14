package cap04;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class Question2 {
	
	static boolean[][] connectivity
	 ={
	 {	false,	true,	false,	false	},
	 {	true,	false,	true,	false	},
	 {	false,	true,	false,	true	},
	 {	false,	false,	true,	false	},
	 };

	static boolean rechable(int indexA, int indexB) {
		int n = connectivity.length;
		HashSet<Integer> wasVisited = new HashSet<Integer>(); 
		Queue<Integer> toBeVisited = new LinkedList<Integer>(); 
		toBeVisited.add(indexA);
		while(!toBeVisited.isEmpty()){
			int temp = toBeVisited.remove();
			if(wasVisited.add(temp)){
				for(int i = 1 ; i <=n;i++){
					if(!wasVisited.contains(i) && connectivity[temp-1][i-1]){
						toBeVisited.add(i);
						if(i==indexB){
							return true;
						}
					}
				}
			}
		}
		return false;

	}

	public static void main(String[] args) {
		System.out.println(rechable(1,4));

	}

}
