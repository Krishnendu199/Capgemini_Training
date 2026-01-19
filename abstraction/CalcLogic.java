package abstraction;

public class CalcLogic implements CalC {
	@Override
	public void add(int a, int b)
	{
		System.out.println(a+b);
	}
	@Override
	public void mul(int a, int b)
	{
		System.out.println(a*b);
	}
	@Override
	public void sub(int a, int b)
	{
		System.out.println(a-b);
	}
	public static void main(String[] args) {
		
	}
}
