package collection_framework;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDriver {
	public static void main(String[] args) {
		List<Employee> e= new ArrayList<Employee>();
		e.add(new Employee(12, "Raj", "Finance", 45000));
		e.add(new Employee(15, "Rahul", "IT", 55000));
		e.add(new Employee(15, "Ramesh", "IT", 55000));
		
		List<Employee> e1 = findEmpbyDep(e, "IT");
		List<Employee> e2 = findEmpbySal(e, 45000);
		
		System.out.println("By Dept:");
		for(int i=0;i<e1.size();i++)
		{
			System.out.println(e1.get(i).name);
		}
		System.out.println("------------------");
		System.out.println("By Salary:");
		for(int i=0;i<e2.size();i++)
		{
			System.out.println(e2.get(i).name);
		}
	}
	
	public static List<Employee> findEmpbyDep(List<Employee> employees,String dept)
	{
		List<Employee> f = new ArrayList<Employee>();
		for(Employee e:employees)
		{
			if(e.department.equals(dept))
			{
				f.add(e);
			}
		}
		return f;
	}
	
	public static List<Employee> findEmpbySal(List<Employee> employees,double sal)
	{
		List<Employee> f = new ArrayList<Employee>();
		for(Employee e:employees)
		{
			if(e.salary==sal)
			{
				f.add(e);
			}
		}
		return f;
	}
}
