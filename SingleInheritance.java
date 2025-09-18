package Teaching;

class Programmer//base class or parent or super
{
float salary=4000;
	
}
class SingleInheritance extends Programmer //derived or child or sub
{
	int bonus=1000;//includes both sal & bonus bcoz of inheritance
	
	public static void main(String[] args) {
		SingleInheritance p=new SingleInheritance();
		System.out.println("Programme salary is "+p.salary);
		System.out.println("Programme bonus is "+p.bonus);
	}
}


