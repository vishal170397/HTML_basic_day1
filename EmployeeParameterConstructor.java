package Teaching;

public class EmployeeParameterConstructor {
int empId;
String empName;//variable in heap memory

EmployeeParameterConstructor (int id, String name)//stack, constructor with parameter
{
	empId=id;//id is a temp argument
	empName=name;
}
public static void main (String[] args) {
	// TODO Auto-generated method stub
	EmployeeParameterConstructor myobj=new EmployeeParameterConstructor (12345,"vishal");
	System.out.println(myobj.empId);//empid will be called in stack memeory
	System.out.println(myobj.empName);
}
}
