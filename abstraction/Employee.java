package abstraction;

public abstract class Employee {
	int id;
	String name;
	
	public Employee(int id , String name)
	{
		this.id=id;
		this.name=name;
	}
	public Employee() {
		
	}
	public abstract void printEmployee();
	
	public static void main(String[] args) {
		Raju r = new Raju(13, "Raju", 100000.0);
		r.printEmployee();
		Employee e = new Raju(13, "Raju", 100000.0);
		e.printEmployee();
		
	}
}

class Raju extends Employee {
	double sal;
	
	public Raju (int id, String name, double sal )
	{
		super(id,name);
		this.sal=sal;
	}
	public void printEmployee() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(sal);
	}
}

