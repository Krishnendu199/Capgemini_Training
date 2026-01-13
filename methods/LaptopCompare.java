package methods;

public class LaptopCompare {
	String brand;
	double price;
	public void comparePrice(LaptopCompare lp1)
	{
		if(this.price>lp1.price)
		{
			System.out.println(this.brand);
		}
		else
			System.out.println(lp1.brand);
	}
	public LaptopCompare(String brand,double price)
	{
		this.brand=brand;
		this.price=price;
	}
	public static void main(String[] args) {
		LaptopCompare lp1 = new LaptopCompare("HP",45000);
		LaptopCompare lp2 = new LaptopCompare("Dell",55000);
		lp2.comparePrice(lp1);
	}
	
}
