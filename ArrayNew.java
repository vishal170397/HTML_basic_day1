package Teaching;

import java.util.Scanner;

public class ArrayNew {
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
		int min = arr[0];
		int max = arr[0];
		for(int i=0;i<n;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		//print the results
		System.out.println("Minimum value:"+min);
		System.out.println("Maximum value:"+max);
	}
}