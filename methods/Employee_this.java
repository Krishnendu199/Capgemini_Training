package methods;

public class Employee_this {
	int id;
	String name;
	double salary;
	
	public void initialize(int id, String name, double salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public void printEmployee()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
	}
	public static void main(String[] args) {
		Employee_this e = new Employee_this();
		e.initialize(101, "Raju", 45000.67);
		e.printEmployee();  
	}
}
