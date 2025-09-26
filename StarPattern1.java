package Teaching;

import java.util.Scanner;

public class StarPattern1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		int n = sc.nextInt();
		//Outer loop for rows
		for (int i = 1; i<= n;i++) {
			//Print spaces
			//for each row i from 1 to n
			for (int s=1;s <=n-i;s++)//prints(n-i0,shifts the star to right
				System.out.print(" ");
			//inner loop for stars
			for (int j=1;j<=i;j++) {
				System.out.print("* ");//print i stars
			}
			System.out.println();//move to next line
		}
	}

}
