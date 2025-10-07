package Teaching;

import java.util.*;

public class ArrayListExample2 {

	public static void main(String[] args) {
		List<Integer>Lista=new ArrayList<Integer>();
		Lista.add(600);
		Lista.add(700);
		Lista.add(800);
		System.out.println(Lista);
		
		
		List<Integer> Listb=new ArrayList<Integer>(Lista);//shallow copy
		
		//copying two lists
		Collections.copy(Listb,Lista);
		System.out.println(Listb);
		System.out.println(Lista);
		
		
		//shuffle the list
		System.out.println("List before shuffle"+Lista);
		Collections.shuffle(Listb);
		System.out.println("List afetr shuffle"+Lista);
		
		//reverse the list
		System.out.println("List before reverse"+Lista);
		Collections.reverse(Lista);
		System.out.println("List after reverse"+Lista);
		
		//swap the list
		System.out.println("List before swap"+Lista);
		Collections.swap(Listb, 0, 2);
		System.out.println("List before swap"+Lista);
		
		//sort the list
		System.out.println("List before sort"+Lista);
		Collections.sort(Lista);
		System.out.println("List after sort"+Lista);
		
		ArrayList<String> listString=new ArrayList<String>();
		listString.add("RED");
		listString.add("BLUE");
		listString.add("GREEN");
		listString.add("YELLOW");
		listString.add("BLACK");
		Collections.sort(listString);
		System.out.println(listString);
		
		
		//descending(sort)
		Collections.sort(listString,Collections.reverseOrder());
		
		System.out.println(listString);
		
		
		ArrayList<String> listString2=new ArrayList<String>();
		listString2.add("RED");
		listString2.add("BLUE");
		listString.add("GREEN");
		listString2.add("VIOLET");
		listString2.add("ORANGE");
		
		
		//add all the arrayList(Appends all the list in the obj)
		ArrayList<String> listString3=new ArrayList<String>();
		listString3.addAll(listString);
		listString3.addAll(listString2);
		System.out.println(listString3);

		
		    //compare both the arrayList
		ArrayList<String> listCompare=new ArrayList<String>();
		for(String e:listString)
		{
			listCompare.add(listString2.contains(e)? "Yes":"No");
			System.out.println(listCompare);
			listCompare.clear();
		}

	}

}