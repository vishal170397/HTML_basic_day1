package Teaching;

import java.util.Scanner;

public class ArrayImplemetation {

	public static void main(String[] args) {
		//Intialize the array
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n=scan.nextInt();
		
		int[] arr=new int[n];//array initialize, n is the number of elements
		
		//Input
		System.out.println("Enter" +n+"elements");
		for(int i=0;i<n;i++)
	
		{
			arr[i]=scan.nextInt();
		}
		//print or output
		for(int i=0;i<n;i++)
		{
			System.out.println("The array elements are");
			System.out.print(arr[i]+" ");
		}
	}
}
