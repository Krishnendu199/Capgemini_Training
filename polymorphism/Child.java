package polymorphism;

public class Child extends Parent{
	
	public void home()
	{
		System.out.println("Red");
	}
	public static void home2()
	{
		System.out.println("Child");
	}
	public void bike() {
		System.out.println("BMW");
	}
	public static void main(String[] args) {
		Parent p = new Parent();
		p.home();
		//p.bike();
		Child c = new Child();
		c.home();
		c.bike();
		Parent p2 = new Parent();
		p2.home();
		p2.home2();
		//p2.bike();
	}
}
