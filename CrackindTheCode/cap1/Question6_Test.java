package cap1;

public class Question6_Test {

	public static void main(String[] args) {
		Pixel[][] image = new Pixel[5][5];
		int k=0;
		for(int j=0; j<5; j++){
			for(int i=0; i<5; i++){
				image[i][j]=new Pixel(k);
				k++;
			}
		}
		Question6 matrix = new Question6(5, image);
		System.out.println(matrix.toString());
		matrix.rotationate90Degrees();
		System.out.println(matrix.toString());
	}

}
