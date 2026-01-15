package has_a;

public class Car {
	private Engine engine;
	private int id;
	private String color;
	private  String brand;
	
	public void setId(int id)
	{
		this.id=id;
	}
	public void setColor(String color)
	{
		this.color=color;
	}
	public void setBrand(String brand)
	{
		this.brand=brand;
	}
	public void setEngine(Engine engine)
	{
		this.engine=engine;
	}
	public int getId()
	{
		return id;
	}
	public String getColor()
	{
		return color;
	}
	public String getBrand()
	{
		return brand;
	}
	public Engine getEngine()
	{
		return engine;
	}
	public static void main(String[] args) {
		Car c = new Car();
		Engine e1 = new Engine();
		e1.setCC(4500);
		e1.setType("Diesel");
     	c.setEngine(e1);
		c.setBrand("Honda");
		c.setId(12345);
		c.setColor("Red");
		System.out.println(c.getBrand());
		System.out.println(c.getColor());
		System.out.println(c.getId());
		System.out.println(c.getEngine().getCC());
		System.out.println(c.getEngine().getType());
	}
}
