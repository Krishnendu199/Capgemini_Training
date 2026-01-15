package NPtypecasting;

public class HelperVehicle {
	public static void getVehicle(Vehicle v)
	{
		if(v instanceof Car)
		{
			Car c = (Car)v;
			c.passengers();
		}
		else if(v instanceof Bike)
		{
			Bike b = (Bike)v;
			b.topSpeed();
		}
		else if(v instanceof Train)
		{
			Train t = (Train)v;
			t.ticketPrice();
		}
		else
			System.out.println("Invalid");
	}
	public static void main(String[] args) {
		Bike b = new Bike();
		Train t = new Train();
		getVehicle(t);
	}
}
