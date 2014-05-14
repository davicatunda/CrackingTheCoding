package cap01;

class Pixel{
	Byte[] bytes=new Byte[4];
	public Integer value;
	public Pixel(Integer value){
		this.value=value;
	}
	public String toString(){
		return value+" ";
	}
}

public class Question6 {
	Pixel[][] image;
	int n;
	
	public Question6(int n){
		this.n=n;
		image=new Pixel[n][n];
	}
	public Question6(int n, Pixel[][] image){
		this.n=n;
		this.image=image;
	}
	
	/*
	 * 		a--------b		d--------a          o o o o		o o o o o
	 * 		|		 |		|		 |			o x x o		o o o o o
	 * 		|		 |   => |		 |  		o x x o		o o x o o
	 * 		|		 |		|		 |			o o o o		o o o o o
	 *		d--------c		c--------b						o o o o o
	 */
	
	public void rotationate90Degrees(){
		Pixel aux;
		int i=0, j=0;
		
		while(j<n/2){
			i=j;
			while(i<n-1-j){
				aux=image[i][j];
				image[i][j]=image[j][n-1-i];
				image[j][n-1-i]=image[n-1-i][n-1-j];
				image[n-1-i][n-1-j]=image[n-1-j][i];
				image[n-1-j][i]=aux;
				j++;
			}
			j++;
		}
	}
	
	public String toString(){
		String str="";
		for(int j=0;j<n;j++){
			for(int i=0;i<n;i++){
				if(image[i][j].value<10)
					str+="0";
				str+=image[i][j];
			}
			str+="\n";
		}
		return str;
	}
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
