package teaching;

public class Operator {
public static void main(String a[]) {
	//(%) Operator(Reminder)	 
	 int a1=13,b1=4, result;
	 result=a1%b1;
	 System.out.println("% Values is"+result);
	 
//(/)Operator (Quotient)
	 int result1=a1/b1;
	 System.out.println("/ values is"+result1);
	 
//(*) Operator(Multiply)
	 int result2=a1*b1;
	 System.out.println("* values is"+result2);
	 
//Unary Plus(+,-)
	 int resultunaryminus=-5;
	 System.out.println("Values is"+resultunaryminus);
	 
//Unary Operator(++)
//Post increment ----Use the value, then increase
	 System.out.println("Post Increment++"+a1++);
	 System.out.println(a1);
	 
//Pre increment---increase first then use
	 System.out.println(++a1);
	 
//Post Increment---Use the value then decrease
	 System.out.println(b1--);
	 
//Pre Decrement---decrease first then use
	 System.out.println(--b1);
	 
	 
//Relative Operator or Comparison Operator
	 int e=20,f=30,g=40;
//>-Greater than
	 System.out.println(f>e);
//<-Lesser than
	 System.out.println(f<e);
//==-Equal to
	 System.out.println(f==e);
//>=-Greater than equal to
	 System.out.println(f>=e);
//<=-Lesser than equal to 
	 System.out.println(f<=e);
//!=-not equal to
	 System.out.println(f!=e);
	 
// Logical Operator
	 boolean x=true;
	 boolean y=false;
	 System.out.println(x && y);
	 System.out.println(x || y);
	 System.out.println(!x);
	
	
}
}
