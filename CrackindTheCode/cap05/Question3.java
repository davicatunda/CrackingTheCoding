package cap05;

public class Question3 {
	static void printBinary(int n){
		while (n > 0) {
			System.out.print(n & 1);
			n = n >> 1;
		}
	}
	
	static void sameAmmountOfOnes(int n) {
		int aux = n;
		int count = 0;
		while (aux > 0) {
			if ((aux & 1) == 1)
				count++;
			aux = aux >> 1;
		}
		int countAux = -1;
		int bigger = n;
		while (count != countAux) {
			bigger += 1;
			countAux = 0;
			aux = bigger;
			while (aux > 0) {
				if ((aux & 1) == 1)
					countAux++;
				aux = aux >> 1;
			}
		}
		countAux = -1;
		int smaller = n;
		while (count != countAux) {
			smaller -= 1;
			countAux = 0;
			aux = smaller;
			while (aux > 0) {
				if ((aux & 1) == 1)
					countAux++;
				aux = aux >> 1;
			}
			
		}
		System.out.print("number:\t"+n+"\tbin:");printBinary(n);
		System.out.print("\nbigger:\t"+bigger+"\tbin:");printBinary(bigger);
		System.out.print("\nsmaller:"+smaller+"\tbin:");printBinary(smaller);
	}

	public static void main(String[] args) {
		sameAmmountOfOnes(234);
	}
}
