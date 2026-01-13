package methods;

public class StudentObject {
	int id;
	String name;
	public void study() {
		System.out.println(id);
		System.out.println(name);
		System.out.println("Studying");
	}
	public static void main(String[] args) {
		StudentObject s = new StudentObject();
		System.out.println(s.id);
		s.id =101;
		s.name= "xyz";
		System.out.println(s.id);
		System.out.println(s.name);
		s.study();
		   
	}
}
