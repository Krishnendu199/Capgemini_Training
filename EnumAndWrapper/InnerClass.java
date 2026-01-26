package EnumAndWrapper;

public class InnerClass {
	static int a=10;
	static class Student{
		public static void m1()
		{
			System.out.println(a);
		}
	}
	public static void main(String[] args) {
		Student.m1();
	}
}

//create three inner class and an staff as interface(classes will implement staff) also use enum.