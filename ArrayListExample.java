package Teaching;

import java.util.*;

public class ArrayListExample {

	public static void main(String[] args) {
	 //Interface<Typescript> obj=new class(Sp interface)<Typescript>();
	//<object or class or datatypes>
		List<Integer> a=new ArrayList<Integer>();
		//adding the element at the specific position
				//obj.add(value)
				a.add(100);
				a.add(200);
				a.add(400);
				a.add(0,500);//elements at the specific position
				System.out.println(a);
				List<Object> mix=new ArrayList<>();
				mix.add(100);
				mix.add("String");
				mix.add(0.9);
				mix.add(100000000);
				System.out.println(mix);
				
				
				int num=(int) mix.get(0);//typecasting
				System.out.println(num);
				
				String str1=(String) mix.get(1);//typecasting
				//System.out.println(get(0));
				System.out.println(mix);
				
				
				
				
				//Insert element at the begining of the list(0)
				for(int i=0;i<a.size();i++) {
					
					System.out.println(a.get(i));
					
				}
				
				
				Iterator <Integer> it=a.iterator();
				while(it.hasNext()) {
					Integer s=it.next();
					System.out.println(s);
				
				
				

	}
	}

}