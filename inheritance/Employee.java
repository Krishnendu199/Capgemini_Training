package inheritance;

public class Employee extends Human {
	int id;
	int sal;
	
	public Employee(String name, int age, char gender, int id, int sal)
	{
		super(name,age,gender);
		this.id=id;
		this.sal=sal;
	}
	public void printEmployee()
	{
		System.out.println(name);
		System.out.println(age);
		System.out.println(gender);
		System.out.println(id);
		System.out.println(sal);
	}
	public static void main(String[] args) {
		Employee e = new Employee("Raju", 34, 'M', 12, 50000);
		e.printEmployee();
	}
}
