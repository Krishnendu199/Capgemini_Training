package objects;

public class Laptop {
	String brand;
	double price;
	public void comparePrice(Laptop lp1)
	{
		if(this.price>lp1.price)
		{
			System.out.println(this.brand+" is Costly");
		}
		else
			System.out.println(lp1.brand+" is Costly");
	}
	public Laptop()
	{
		
	}
	public Laptop(String brand,double price)
	{
		this.brand=brand;
		this.price=price;
	}
	public static void main(String[] args) {
		Laptop lp1 = HelpLaptop.getLaptop();
		lp1.brand="HP";
		lp1.price=45000.0;
		Laptop lp2 = HelpLaptop.getLaptop();
		lp2.brand="Dell";
		lp2.price=55000.0;
		Laptop lp3 = HelpLaptop.getLaptopWithData(65000.0,"Asus");
		//lp3.comparePrice(lp2); 
		Laptop lp4 = HelpLaptop.getLaptopByVerifyingPrice("MSI", 70000);
	}
	
}
