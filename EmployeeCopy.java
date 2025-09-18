package Teaching;

public class EmployeeCopy {
	int empId;
	String empName;//variable in heap memory

	EmployeeCopy (int id, String name)//stack, constructor with parameter
	{
		this.empId=id;//id is a temp argument
		this.empName=name;
}
	
	EmployeeCopy(EmployeeCopy copy)//copy constructor(passing obj of construc)
	{
		this.empId=copy.empId;//id is a temp arugemnt
		this.empName=copy.empName;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeCopy myobj=new EmployeeCopy(12345,"vishal");
		System.out.println(myobj.empId);//empid will be called in stack memory
		System.out.println(myobj.empName);
	}
		
	}
