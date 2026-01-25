package collection_framework;

import java.util.List;
import java.util.ArrayList;

public class Employee {
	public int id;
	public String name;
	public String department;
	public int salary;
	
	public Employee (int id, String name,String department,int salary)
	{
		this.id=id;
		this.name=name;
		this.department=department;
		this.salary=salary;
	
	}
	
	public String toString()
	{
		return "id:"+id+" name:"+name +" sal: "+salary+" dept:"+department;
	}
}
