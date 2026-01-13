package methods;

public class Static_variables {
	static int a =10;
	static int b;
	static String pm = "modi";
	static String c;
	public static void e1() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(pm);
		System.out.println(c);
	}
	public static void e2()
	{
		int a = 20;
		System.out.println(a);
		System.out.println(Static_variables.a);
	}
	public static void e3() {
		System.out.println(Stud1.student);
	}
	public static void main(String[] args) {
		Static_variables.e3();
	}
}
