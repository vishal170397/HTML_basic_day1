package teaching;
abstract class shape//abstract class classname
{
	int a=2;//attribute
	public abstract void react();//abstract method(compulsary)
	public void cir() {
		System.out.println("CIRCLE");
	}
}
class pen extends shape{
	public void react() {//defining the abstract method
		System.out.println("RECTANGLE"+a);
		
	}
}
public class AbstractMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pen obj=new pen();//class
		//abstract class objname=new classname()
		shape obj2=new pen();//upcasting
		obj.react();
		obj2.cir();
		

	}

}
