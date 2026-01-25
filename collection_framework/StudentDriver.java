package collection_framework;

import java.util.ArrayList;

public class StudentDriver {
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student(10,"xyz"));
		list.add(new Student(11,"abc"));
		list.add(new Student(12,"aaa"));
		 
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i).id);
			System.out.println(list.get(i).name);
			System.out.println("----------------");
		}
	}
	
}
