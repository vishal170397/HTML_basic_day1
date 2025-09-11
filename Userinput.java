package teaching;
import java.util.*;

public class Userinput {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		//nextInt,nextFloat,nextDouble,nextLine
		System.out.println("Enter a FirstNumber:");
		int a=sc.nextInt();
		System.out.println("Enter a SecondNumber:");
		int b=sc.nextInt();
		System.out.println("Enter a ThirdNumber:");
		int c=sc.nextInt();
		int d=a+b+c;
		System.out.println("Total:"+d);
		 sc.nextLine();
		System.out.println("Enter a Name:");
		String name=sc.nextLine();
		System.out.println("The Name is:"+name);
		System.out.println("Enter Salary:");
		double num=sc.nextDouble();
		System.out.println("The Salary is:"+num);
		System.out.println("Enter the character:");
		char ch=sc.next().charAt(0);
		System.out.println("The character is:"+ch);
		if(d>100)
		{
			System.out.println("The Value is greater than 100");
		}
		else
		{
			System.out.println("The value is lesser than 100");
		}
		
		
	}

}

