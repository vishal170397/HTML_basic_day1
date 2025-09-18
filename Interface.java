package Teaching;

interface Shape //interface interfacename
{
	double getarea();
}
class Rectangle implements Shape
{
	private double length;//heap
	private double width;
	public Rectangle(double length,double width)//p constructor
	{
		//l=length;//w=width
		this.length=length;
		this.width=width;
	}
	public double getarea()
	{
		return length*width;
	}
}
class Triangle implements Shape
{
private double base;
private double height;
public Triangle(double base,double height)
{
	this.base=base;
	this.height=height;
}
public double getarea()
{return 0.5 *base*height;
}
}
class Circle implements Shape{
	private double radius;
	public Circle (double radius) {
		this.radius=radius;
	}
	public double getarea()
	{
		return 3.14*radius*radius;
	}
}
public class Interface {
	public static void main(String[] args) {
		//with creating obj using class with interface
		//interfacename obj=new Classname();
		//interfacename obj=new class(parameters)
		Shape rectangle = new Rectangle(5.0,8.0);
		Shape triangle = new Triangle(5.0,8.0);
		Shape circle = new Circle(7.9);
		System.out.println("Area of Rectangle"+rectangle.getarea());
		System.out.println("Area of Triangle"+triangle.getarea());
		System.out.println("Area of Circle"+circle.getarea());
	}
}