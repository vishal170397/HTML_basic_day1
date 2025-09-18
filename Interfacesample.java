package Teaching;
//Interface1
interface a1
{
	public void show();//same method
}
//Interface2
interface b1
{
	public void show1();//DIFFERENT method
}
class Intefacesample implements a1,b1//2 interface under a class
{
	public void show() //same method
	{
		System.out.println("show from A1");
	}
	public void show1() // same method
	{
		System.out.println("show from B1");
	}
	public static void main(String[] args)
	{
		Intefacesample obj=new Intefacesample();//class obj used
		obj.show();
		obj.show1();
	}
}