package inheritance;

public class Laptop extends Prod{
	int price;
	String Proccesor;
	public Laptop(String brand, int price ,String Proccesor)
	{
		super(brand);
		this.price=price;
		this.Proccesor=Proccesor;	
	}
	public void printLaptop() {
		System.out.println(brand);
		System.out.println(price);
		System.out.println(Proccesor);
	}
	public static void main(String[] args) {
		Laptop l = new Laptop("HP", 45500, "Intel");
		l.printLaptop();
	}

}
