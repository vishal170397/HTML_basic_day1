package teaching;
public class Encapsulation {
	private String name; //Private Variable
	//get must requires return type
	public String getName() //getter
	{
		return name;
	}
	public void setname(String newname) //setter
	{
		this.name=newname; //this refers to current obj reference	
	}
 	public static void main(String[] args) {
 		Encapsulation obj=new Encapsulation(); //obj
 			obj.setname("S Maruthu");
 			System.out.println(obj.getName());
		
	}
		
}