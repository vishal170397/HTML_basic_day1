package Teaching;
//here we can see static and public method
public class StaticMethod {
	static int count;//static variable
	static void myStaticmethod()//static method
	{
		count++;
		System.out.println("Static method can be called without object "+count);
	}
	public void mypublicMethod()
	{
		System.out.println("public method will be used with objects");
	}
	public static void main(String[] args) {
		myStaticmethod();//directly calling static method without obj
		StaticMethod.myStaticmethod();//static method
 StaticMethod obj=new StaticMethod();//create obj for public method
 obj.mypublicMethod();
	}

}
