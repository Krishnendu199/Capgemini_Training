package polymorphism;

public class MapV1 {
	public void route()
	{
		System.out.println("Showing Directions");
	}
	public static void main(String[] args) {
		MapV1 m1 = new MapV1();
		MapV2 m2 = new MapV2();
		MapV3 m3 = new MapV3();
//		m1.route();
//		m2.route();
//		m3.route();
//		m3.bookcab();
		m1=new MapV3(); //upcasting
		m1.route();
		
		m3 = (MapV3)m1; //downcasting
		m3.route();
		m3.bookcab();
		
		m2 = (MapV2)m1; //possible
		m2.route();
	}
}
class MapV2 extends MapV1
{
	@Override
	public void route()
	{
		System.out.println("Showing Duration");
		System.out.println("Showing Directions");
	}
}
class MapV3 extends MapV2
{
	public void bookcab()
	{
		System.out.println("Booking an Uber");
	}
}
