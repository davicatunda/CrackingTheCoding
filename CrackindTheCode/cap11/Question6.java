package cap11;

class Position {
	int x;
	int y;

	public Position(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public String toString(){
		return "Position: ("+(x+1)+", "+(y+1)+");";
	}
}

public class Question6 {

	static Position getPosition(int[][] matrix, int value) {
		// matrix[x][y]
		int minX = 0;
		int maxX = matrix.length-1;
		int minY = 0;
		int maxY = matrix[0].length-1;
		int posX = (minX + maxX) / 2;
		int posY = (minY + maxY) / 2;
		
		while (matrix[posX][posY] != value) {
			boolean stopX = (maxX - minX <= 2);
			boolean stopY = (maxY - minY <= 2);
			if (stopY && stopX) {
				if (matrix[minX][minY] == value)
					return new Position(minX, minY);
				if (matrix[maxX][minY] == value)
					return new Position(maxX, minY);
				if (matrix[minX][maxY] == value)
					return new Position(minX, maxY);
				if (matrix[maxX][maxY] == value)
					return new Position(maxX, maxY);
				else
					return null;
			}
			if (!stopY) {
				if (matrix[posX][posY] > value) {
					maxY = posY;
				} else {
					minY = posY;
				}
				posY = (minY + maxY) / 2;
			}
			if (!stopX) {
				if (matrix[posX][posY] > value) {
					maxX = posX;
				} else {
					minX = posX;
				}
				posX = (minX + maxX) / 2;
			}
		}
		return new Position(posX, posY);
	}

	public static void main(String[] args) {
		int[][] matrix = {{15,20,40,85},{20,35,80,95},{30,55,95,105},{40,80,100,120}};
		System.out.println(getPosition(matrix, 15)+" 1,1");
		System.out.println(getPosition(matrix, 20)+" 1,2 or 2,1");
		System.out.println(getPosition(matrix, 40)+" 1,3 or 4,1");
		System.out.println(getPosition(matrix, 85)+" 1,4");//error
		System.out.println(getPosition(matrix, 35)+" 2,2");
		System.out.println(getPosition(matrix, 80)+" 2,3 or 4,2");
		System.out.println(getPosition(matrix, 95)+" 3,3");
		System.out.println(getPosition(matrix, 30)+" 3,1");
		System.out.println(getPosition(matrix, 55)+" 3,2");//erro
		System.out.println(getPosition(matrix, 95)+" 2,4 or 3,3");
		System.out.println(getPosition(matrix, 105)+" 3,4");//erro
		System.out.println(getPosition(matrix, 100)+" 4,3");//erro
		System.out.println(getPosition(matrix, 120)+" 4,4");
		System.out.println(getPosition(matrix, 37)+" null");

	}

}
