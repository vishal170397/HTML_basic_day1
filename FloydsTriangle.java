package Teaching;

public class FloydsTriangle {

	public static void main(String[] args) {
		int num=1;
		int rows=5;
		for (int i=1;i<=rows;i++)//no of rows
		{
			for(int j=1;j<=1;j++)// number in each row{
				System.out.print(num + " ");//prints num along with space
			num++;
		}
		System.out.println();
		num++;
	}
}
