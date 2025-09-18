package Teaching;
//Single & Multiple(interface)
class Humanbody//Single Inheritance class
{
	public void displayHuman() {
		System.out.println("About Human body");
	}
}
interface male//interface1
{
	public void show();//No definition only declaration
}
interface female//interface2
{
	public void show();//same method
}
public class Hybridinheritance extends Humanbody implements male,female
{public void show()
	{
		System.out.println("Implementation of show method in both male and female");}
public void displayHybrid()
{
	System.out.println("method about hybrid inheritance");
}
public static void main(String[] args)
{
	Hybridinheritance obj=new Hybridinheritance();
	System.out.println("Implementation of hybrid inheritance in java");
	obj.show();
	obj.displayHybrid();
}
	
}