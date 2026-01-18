package abstraction;

public class CalcChild1 extends Calculator{
	
	@Override
	public int add(int a, int b) {
		return a+b;
	}
	
	public int multi(int a, int b)
	{
		return a*b;
	}
	
	public void m1() {
		System.out.println("Child method");
	}
	
	public static void main(String[] args) {
		Calculator c = new CalcChild1();
		CalcChild1 c1 = new CalcChild1();
		System.out.println(c.add(12, 13));
		System.out.println(c.multi(5, 6));
		System.out.println(c.sub(40, 20));
		//c.m1(); //Error
		
		System.out.println(c1.add(12, 13));
		System.out.println(c1.multi(5, 6));
		System.out.println(c1.sub(40, 20));
		c1.m1();
	}
}
