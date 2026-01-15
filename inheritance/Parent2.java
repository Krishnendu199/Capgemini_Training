package inheritance;

public class Parent2 {
	public void m1()
	{
		System.out.println("parent method");
	}
	public static void main(String[] args) {
		Child1 c = new Child1();
		Parent2 p = c;// UpCasting
		p.m1();
		//p.m2(); //C-T Error
		Child1 c2 = (Child1)p; //DownCasting
		c2.m1();
		c2.m2();
	}
}
class Child1 extends Parent2
{
	public void m2()
	{
		System.out.println("child method");
	}
}
