package Teaching;

public class MatrixSubtraction {
	public static void main(String[] args) {
		//Creating two Matrices
		int a[][]= {{1,3,4},{2,4,3},{3,4,5}};
		int b[][]= {{4,5,7},{8,9,10},{5,3,4}};
		
		//Creating Another Matrix to store the sum of Matrices
		int c[][]=new int[3][3];
		//adding and printing the subtraction of 2 matrices
		for (int i=0;i<3;i++)//row 
			{
			for (int j=0;j<3;j++)//column
			{
				c[i][j]=a[i][j]-b[i][j];//addition or sub
				System.out.print(c[i][j]+" ");
			}
		
		System.out.println();//next line
	}
	}
}