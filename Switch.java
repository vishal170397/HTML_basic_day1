package teaching;
import java.util.*;

public class Switch {
	//why float

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a month:");
		Scanner sc=new Scanner(System.in);
		int mon=sc.nextInt();
		String monthString;
		switch (mon)
		{
		case 1:monthString="jan";break;
		case 2:monthString="feb";break;
		case 3:monthString="mar";break;
		case 4:monthString="apr";break;
		case 5:monthString="may";break;
		case 6:monthString="jun";break;
		default:monthString="Invalid month";
		
		}
	    System.out.println(monthString);

	}

}
