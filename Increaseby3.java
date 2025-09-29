package Teaching;

public class Increaseby3 {

	public static void main(String[] args) {
		int num=12;
		for (int i=1;i<=3;i++)//no of rows
		{
			for(int j=1;j<=i;j++)//no of elements in each row i.e j
			{
				System.out.print(num + " ");//prints num along with space
				
				num+=3;
			}
			System.out.println();
		}
	}
}
