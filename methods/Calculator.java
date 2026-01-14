package methods;

public class Calculator {
	public static void add(int a, int b)
	{
		System.out.println(a+b);
	}
	public static void sub(int a, int b)
	{
		System.out.println(a-b);
	}
	public static void mul(int a, int b)
	{
		System.out.println(a*b);
	}
	public static void div(int a, int b)
	{
		System.out.println(a/b);
	}
	public static void main(String[] args) {
		add(8,9);
		sub(34, 5);
		mul(5,6);
		div(20,5);
	}

}
