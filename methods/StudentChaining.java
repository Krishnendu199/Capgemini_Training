package methods;

public class StudentChaining {
	int id;
	String name;
	long phone;
	public StudentChaining(int id)
	{
		this.id=id;
	}
	public StudentChaining(int id,String name)
	{
		this(id);
		this.name = name;
	}
	public StudentChaining(int id,String name,long phone)
	{
		this(id,name);
		this.phone= phone;
	}
	public void display()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(phone);
		System.out.println("-------------");
	}
	public static void main(String[] args) {
		StudentChaining sc = new StudentChaining(101,"Raju");
		sc.display();
	}
}
