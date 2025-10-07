package Teaching;
import java.util.*;

public class LinkedtoArray {

	public static void main(String[] args) {
		List<String> cars=new LinkedList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		System.out.println(cars);
		 cars.addFirst("Mazda");
		cars.addLast("Audi");
		System.out.println(cars);
		//use removeFirst() remove the first item from the list
		cars.removeFirst();
		cars.removeLast();
		cars.getFirst();
		cars.getLast();
		
		//converting Linkedlist into array
		Object[] a=cars.toArray();
		
		System.out.println("After converted LinkedList to Array");
		for(Object elements:a)
		{
			System.out.println(elements+" ");
		}
		
		

	}

}