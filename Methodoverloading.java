package teaching;
import java.io.*;
//class 1
//Helper class
class Product {
	 //Method 1
	 //Multiplying two integer values
	 public int multiply(int a,int b) {
		 int prod=a*b;
		 return prod;
	 }

	 //Methods 2
	 //Multiplying three integer values
	 public int multiply(int a,int b,int c) {
		 int prod=a*b*c;
		 return prod;}
	 
	 }
     //class 2
//Main class
public class Methodoverloading{
	//Main driver method
	public static void main(String[] args) {

		//creating object of above class inside main(

		//method
		Product ob=new Product();
		
		//calling method to multiply 2 numbers
		int prod1= ob.multiply(1, 2);
		
		//Printing Product of 2 numbers
		System.out.println("Product of the two integer value :"+ prod1);
		
		//Calling method to multiply 3 numbers
		int prod2=ob.multiply(1,2,3);
		
		//Printing product of 3 numbers
		System.out.println("Product of the three integer value :"+ prod2);
		
		
	}

	}
