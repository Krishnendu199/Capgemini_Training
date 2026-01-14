package objects;

public class This_Student {
	int id;
	String name;
	public void initialize(int id, String name)
	{
		this.id = id;
		this.name = name ;
	}
	public void display() {
		System.out.println(id);
		System.out.println(name);
	}
	public static void main(String[] args) {
		This_Student ts = new This_Student();
		ts.display();
		ts.initialize(0, "XYZ");
		ts.display();
	}
}
