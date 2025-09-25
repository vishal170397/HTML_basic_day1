package Teaching;

import java.util.Scanner;

public class Multi {
public static void main (String[] args) {
	Scanner sc=new Scanner(System.in);
	int a[][]=new int[100][100];//row-100,column-100
	int row,col,i,j;
	System.out.println("Enter Number of Row");
	row=sc.nextInt();
	
	System.out.println("Enter Number of Column");
	col=sc.nextInt();
	
	//i-row,j-column
	for(i=0;i<row;i++) {
		for(j=0;j<col;j++) {
			System.out.printf("Enter the array Elements",i,j);
			a[i][j]=sc.nextInt();
		}
	}
	System.out.println("Display 2D Array Elements is: ");
	for(i=0;i<row;i++) {
		for(j=0;j<col;j++) {
			System.out.println(a[i][j]+ " ");
		}
	}
}
}
