package NPtypecasting;

public class Vehicle {
	public void travel()
	{
		System.out.println("Traveling");
	}
	public static void main(String[] args) {
		Vehicle v1 = new Car();
		Vehicle v2 = new Bike();
		Vehicle v3 = new Train();
		v1.travel();
		Car c1 = (Car)v1;
		Bike b1 = (Bike)v2;
		Train t1 = (Train)v3;
		c1.travel();
		c1.passengers();
		b1.travel();
		b1.topSpeed();
		
	}
}
class Car extends Vehicle
{
	public void passengers()
	{
		System.out.println("5 passngers in Car");
	}
}
class Bike extends Vehicle
{
	public void topSpeed()
	{
		System.out.println("Top Speed of Bike is 70kmph");
	}
}
class Train extends Vehicle
{
	public void ticketPrice()
	{
		System.out.println("Ticket Price of Train is 1000");
	}
}
