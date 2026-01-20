package Object_Class;

import java.util.Objects;

public class Student {
	int id;
	String name;
	int mark;
	public Student(int id,String name) {
		this.id=id;
		this.name=name;
	}
	
	public boolean StudentCheck(Student s)
	{
		if(this.hashCode()==s.hashCode())
			return true;
		else
			return false;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id,name);
	}
	
	public static void main(String[] args) {
		Student s1 = new Student(10, "xyz");
		Student s2 = new Student(10, "xyz");
		System.out.println(s1.StudentCheck(s2));
	}
}
