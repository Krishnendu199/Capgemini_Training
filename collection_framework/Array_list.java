package collection_framework;

import java.util.ArrayList;

public class Array_list {
public static void main(String[] args) {
	ArrayList a1 = new ArrayList(); //10
	a1.add("java");
	a1.add(45.8);
	ArrayList a2 = new ArrayList(30); //30
	ArrayList a3 = new ArrayList(a1); //java,45.8
	
	a2.add("D");
	a2.add("E");
	a1.addAll(a2);
	
	System.out.println(a1);
	System.out.println(a2);
}
}
