package methods;

public class StaticBlock {
	static
	{
		int a =10;
		System.out.println("SB1");
		System.out.println(a);
	}  
	static
	{
		System.out.println("SB2");
	}
	public static void main(String[] args) {
		System.out.println("main");
	}
	static
	{
		System.out.println("SB3");
	}
}
