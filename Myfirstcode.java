package teaching;

public class Myfirstcode {

	public static void main(String[] args) {
	    int a=23;
		String str="Maruthu S";
		char c='m';
		long j=12345678;
		float f=75f;
		double d=97.96d;
		byte b= 100;
		short s=5964;
		boolean val=false;
	
		System.out.println("int as data type:"+a);
		System.out.println("String as data type"+str);
		System.out.println("char as data type"+c);
		System.out.println("float as data type"+f);
		System.out.println("double as data type"+d);
		System.out.println("byte as data type"+b);
		System.out.println("short as data type"+s);
		System.out.println("boolean as data type"+val);
// Widening casting(Automatic casting)-converting smaller type into larger type size
// byte-short-char-int-long-float-double.
// narrowing casting(manual casting)-converting larger type size into smaller type. 
//double-float-long-int-char-short-byte.
		
		int myInt=9;//integer
		double myDouble=myInt;
		//automatic or widening casting
		System.out.print("The Value of myint is"+myInt);
		System.out.println("The value of myDouble is"+myDouble);
		
		double myDouble1=7.78d;
		//Datatype varname=(converteddatatype) convVariable;
		int myInt1=(int) myDouble;
		//Manual Casting double into int
		System.out.println("The Value of myint1 is"+myInt1);
		System.out.println("The Value of myDouble1 is"+myDouble);

	}

}
