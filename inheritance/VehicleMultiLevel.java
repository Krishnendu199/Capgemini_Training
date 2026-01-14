package inheritance;

public class VehicleMultiLevel {
	String color;
	
	public static void main(String[] args) {
		Bike1 b = new Bike1("Black","Honda",150000);
		b.printVehicle();
		Car c = new Car("Blue","BMW",3500000);
		c.printVehicle();
	}
}
class Bike1 extends VehicleMultiLevel
{
	String brand;
	int price;
	public Bike1(String color,String brand,int price) {
		this.color= color;
		this.brand=brand;
		this.price=price;
	}
	public void printVehicle()
	{
		System.out.println("Bike Details:");
		System.out.println(brand);
		System.out.println(color);
		System.out.println(price);	
		System.out.println("---------------------");
	}
}
class Car extends VehicleMultiLevel
{
	String brand;
	int price;
	public Car(String color,String brand,int price) {
		this.color= color;
		this.brand=brand;
		this.price=price;
	}
	public void printVehicle()
	{
		System.out.println("Car Details:");
		System.out.println(brand);
		System.out.println(color);
		System.out.println(price);	
	}
}

