package teaching;
import java.util.*;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first no:");
		int a=sc.nextInt();
		System.out.println("Enter second no:");
		int b=sc.nextInt();
		temp=a;
		a=b;
		b=temp;
		//another logic
		a=a+b;
		a=a-b;
		b=a-b;
		System.out.println(a);
		System.out.println(b);
		

	}

}
