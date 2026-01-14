package objects;

public class Example2 {
	int a1;
	static int a2;
	Student s1;
	static Student s2 = new Student();
	public Example2()
	{
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(this.a1);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(this.s1);
	}
}
