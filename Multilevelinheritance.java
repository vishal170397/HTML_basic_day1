package Teaching;

class MultiOne
{ void One()
	{
	System.out.println("This is a Base class");
	}
}
class MultiSecond extends MultiOne
{void second()
	{
	System.out.println("This is a Intermediate class");
	
	}
	
}
class MultiThird extends MultiSecond
{void Third()
	{
	System.out.println("This is a derived class");
	}
}
public class Multilevelinheritance {
	public static void main(String[] args) {
		MultiThird obj=new MultiThird();
		obj.One();
		obj.second();
		obj.Third();
		
	}
}