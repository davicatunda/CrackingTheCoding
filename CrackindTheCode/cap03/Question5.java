package cap03;
//Question 3.5, resolve hannoi problem with stacks.

class Plate {
	int size;
	Plate next;
}

class Stack {
	Plate top;
}

public class Question5 {
	Stack s1, s2, s3;
	int maxPlateSize;
	
	boolean move (Stack origin, Stack destiny){
		if(origin.top.size > destiny.top.size) return false;
		else{
			Plate aux = origin.top;
			origin.top = origin.top.next;
			aux.next = destiny.top;
			destiny.top = aux;
		}
		return true;
	}
	//Stack 0 is the origin, Stack 1 is the destiny, Stack 2 is the buffer
	void solveHannoiProblem (int numberOfPlates, Stack []tower ){
		if(numberOfPlates % 2==0){
			move (tower[1],tower[3]);
			move (tower[1],tower[2]);
			move (tower[2],tower[3]);
			for(int i=1; i<numberOfPlates-1; i++){
				move(tower[1],tower[2]);
				Stack []novo = {tower[1], tower[1], tower[1]};
				solveHannoiProblem(5, novo);
			}
		}
		else{
			
		}
	}
}
