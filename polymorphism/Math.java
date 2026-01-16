package polymorphism;

public class Math {
	public static void add(int a,int b)
	{
		System.out.println("2 int type of data:");
		System.out.println(a+b);
	}
	
	public static void add(int a,int b, int c)
	{
		System.out.println("3 int type of data:");
		System.out.println(a+b+c);
		
	}
	
	public static void add(float a,float b)
	{
		System.out.println("2 float type of data:");
		System.out.println(a+b);
	}
	
	public static void add(double a,double b)
	{
		System.out.println("2 double type of data:");
		System.out.println(a+b);
	}
	
	public static int add(int a, int b, int c, int d) {
		return (a+b+c+d);
	}
	
	public double add(int a, int b, double c)
	{
		return (a+b+c);
	}
	public static void main(String[] args) {
		add(4,5);
		add(2,3,4);
		add(3.4f,5.6f);
		add(45.67,34.90);
		System.out.println(add(1,2,3,4));
		Math m = new Math();
		System.out.println(m.add(2, 3, 56.90));
	}
}
