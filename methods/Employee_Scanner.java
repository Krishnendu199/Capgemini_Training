package methods;

import java.util.Scanner;

public class Employee_Scanner {
	int id;
	String name;
	double salary;
	
	public void work()
	{
		System.out.println(name+" is working");
	}
	public void printEmployee()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of Employees: ");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			Employee e = new Employee();
			System.out.println("Enter id: ");
			e.id=sc.nextInt();
			System.out.println("Enter Name: ");
			e.name=sc.nextLine();
			e.name=sc.nextLine();
			System.out.println("Enter Salary: ");
			e.salary=sc.nextDouble();
			e.printEmployee();
		}
		
	}
}
