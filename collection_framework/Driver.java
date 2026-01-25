package collection_framework;

import java.util.ArrayList;
import java.util.List;

public class Driver {
	public static void main(String[] args) {
		//generic -> same type element <Datatype>
		//non-generic -> diff type element
		
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("xyz");
		a1.add("abc");
		a1.add("raju");
		a1.add("python");
		
		System.out.println(a1);
		System.out.println(a1.get(0));
		System.out.println(a1.get(1));
		
		System.out.println("python");
		
		
		List<String> list = new ArrayList<>(); 
		list.add("Java");
		list.add("Python");
		list.add("C++");
		
		list.set(1, "Javascript");
		list.remove("C++");
		
		System.out.println("Updated List: "+list);
		
		ArrayList a3 = new ArrayList();
		a3.add("java");
		a3.add(45.8);
		a3.add(true);
		a3.add(20);
		a3.add(null);
		a3.add(null);
		int a = 99;
		a3.add(a); //auto-boxing
		
		System.out.println(a3.size());
		System.out.println(a3);
	}
}
