package objects;

public class HelpLaptop {
	public static Laptop getLaptop()
	{
		Laptop l = new Laptop();
		return l;
		//or,return new Laptop();
	}
	public static Laptop getLaptopWithData(double price, String brand)
	{
		return new Laptop(brand,price);
	}
	public static Laptop getLaptopByVerifyingPrice(String brand,double price)
	{
		if(price>10000 && price<500000)
		{
			System.out.println("Verified");
			return new Laptop(brand,price);
		}
		else
			System.out.println("Price of Laptop is invalid!!");
			return null;
			
	}

}
