package Object_Class;

public class StudentEquals {
	int id;
	String name;
	int mark;
	public StudentEquals(int id,String name) {
		this.id=id;
		this.name=name;
	}
	
	public boolean StudentCheck(StudentEquals s)
	{
		if(this.hashCode()==s.hashCode())
			return true;
		else
			return false;
	}
	
	@Override
	public boolean equals(Object o)
	{
//		if(this==o)
//			return true;
		if(o==null|| o.getClass()!=this.getClass())
			return false;
		StudentEquals s =(StudentEquals)o;
		return this.id == s.id && this.name == s.name;
		
	}
	
	public static void main(String[] args) {
		StudentEquals s1 = new StudentEquals(10, "xyz");
		StudentEquals s2 = new StudentEquals(10, "xyz");
		StudentEquals s3=null;
		Person p = new Person(101,"Raju");
		Object o = new Person(102, "Ram");
		System.out.println(s1.StudentCheck(s2));
		System.out.println(s1.equals(s2));
		System.out.println(s1.getClass()==s2.getClass());
		//System.out.println(s1.getClass()==p.getClass());
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(p));
		System.out.println(o.getClass()==p.getClass());
	}
}
