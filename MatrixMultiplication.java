package Teaching;

public class MatrixMultiplication {
	public static void main(String[] args) {
		//Creating two Matrices
		int a[][]= {{1,3,4},{2,4,3},{3,4,5}};
		int b[][]= {{4,5,7},{8,9,10},{5,3,4}};
		
		//Creating another matrix to store the multipllication of two matrices
		int c[][]=new int[3][3];
		for (int i=0;i<3;i++) {
			for (int j=0;j<3;j++)
			{
				c[i][j]=0;
				for (int k=0;k<3;k++) {
					c[i][j]=c[i][j]+a[i][k]*b[k][j];
				}//k loop ends
				System.out.print(c[i][j]+" ");
			}// j loops ends
			System.out.println();//new line
		}
	}
}
