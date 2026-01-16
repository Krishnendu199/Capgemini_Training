package polymorphism;

public class FindMax {
	public static int max(int a, int b)
	{
		if(a>b)
			return a;
		else
			return b;
	}
	public static int max(int a, int b,int c)
	{	
		if(a>b && a>c) {
			return a;
		}
		else if (b>c)
		{
			return b;
		}
		else
			return c;
		
	}
	public static float max(int a, float b)
	{
		if(a>b)
			return a;
		else
			return b;
	}
	
	public static void main(String[] args) {
		System.out.println(max(4,5));
		System.out.println(max(5,7,8)); //or max(5,max(6,7))
		System.out.println(max(4,3.5f));
	}
}
