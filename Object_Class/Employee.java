package Object_Class;

public class Employee {
	int id;
	String name;
	int salary;
	String department;

	Employee(int id, String name, int salary, String department) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department = department;
	}

	@Override
	public String toString() {
		return "id:" + id + " name:" + name + " salary:" + salary + " department:" + department;
	}

	public static void main(String[] args) {
		Employee[] e = new Employee[3];
		e[0] = new Employee(23, "Rohan", 34000, "ACC");
		e[1] = new Employee(56, "Raj", 64000, "Research");
		e[2] = new Employee(67, "Raghav", 29000, "IT");
		for (int i = 0; i < e.length; i++) {
			System.out.println(e[i]);
		}
		Employee eobj = new Employee(10, "Raju", 56000, "IT");
		System.out.println(eobj);
	}
}
