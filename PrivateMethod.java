package teaching;
class Myclass
{
	private void display()//private method
	{
		System.out.println("Hello from private method");
	}
	public void callDisplay() {
		display();
	}
}
public class PrivateMethod {
	public static void main(String[] args) {
		Myclass obj=new Myclass();
		obj.callDisplay();
				
	}

}
