package polymorphism;

public class Employee {
	int id;
	String name;
	int sal;
	String dept;
	
	public Employee(int id)
	{
		this.id=id;
	}
	public Employee(int id,String name)
	{
		this(id);
		this.name=name;
	}
	public Employee(int id,String name,int sal)
	{
		this(id,name);
		this.sal=sal;
	}
	public Employee(int id,String name,int sal,String dept)
	{
		this(id,name,sal);
		this.dept=dept;
	}
	
	public void display()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(sal);
		System.out.println(dept);
		System.out.println("--------------");
	}
	
	public static void main(String[] args) {
		Employee emp1 = new Employee(23);
		Employee emp2 = new Employee(43,"Raju");
		Employee emp3 = new Employee(53,"Raghav",44500);
		Employee emp4 = new Employee(63,"Ram",50000,"Accounts");
		emp1.display();
		emp2.display();
		emp3.display();
		emp4.display();
;	}
}
