package cap01;

public class Question7 {
	public Integer[][] zeroMN(Integer[][] matrix){
		int numberOfRows=matrix.length;
		int numberOfColumns=matrix[0].length;
		boolean[] isZeroRow = new  boolean[numberOfRows];
		boolean[] isZeroColumn = new  boolean[numberOfColumns];
		for(int j=0;j<numberOfRows;j++){
			for(int i=0; i<numberOfColumns; i++){
				if(matrix[j][i]==0){
					isZeroRow[j]=true;
					isZeroColumn[i]=true;
				}
			}
			
		}
		for(int j=0;j<numberOfRows;j++){
			if(isZeroRow[j]=true)
				for(int i=0;i<numberOfColumns;i++)
					matrix[j][i]=0;
		}
		for(int i=0;i<numberOfColumns;i++){
			if(isZeroColumn[i]=true)
				for(int j=0;j<numberOfColumns;j++)
					matrix[j][i]=0;
		}
		
		
		return matrix;
	}
}
