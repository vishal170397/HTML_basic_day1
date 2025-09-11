package teaching;
class kia{
	void safety() {
		System.out.println("Drive carefully");
	}
}
class car extends kia//Derived or child or subclass
//extends will inherits the class
{
	//its optional but catch mistakes(eg wrong method signature)
	@Override
	void safety() {
		System.out.println("Car is safe but even though frive carefully");
	}
}

public class Methodrinding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//k is declareed as type kia,the overridden method in car is called
		//because of runtime polymorphism
		kia k=new car();//upcasting
		k.safety();
		

	}

}
