package Teaching;
//Single Parent class--company
//Multiplechild classes--Employyee1,Employee2

 class Company {
void CompanyName()
{System.out.println("Hai This is Company Name is TCS");
}
}
 //subclass or child class
 class Employee1 extends Company
 {
	 void EmployeeName1()
	 {System.out.println("Employee name is Vishal");
 }
 }
 //sub child class
 class Employee2 extends Company
 {
	 void EmployeeName2()
	 {System.out.println("Employee name is Nithish");
 }}
 public class HierarchicalInheritance {
	 public static void main(String[] args) {
		 Employee1 emp1 = new Employee1();
		 Employee2 emp2 = new Employee2();
		 emp1.EmployeeName1();
		 emp2.EmployeeName2();
	 }
 }