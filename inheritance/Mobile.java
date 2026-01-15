package inheritance;

public class Mobile extends Prod {
	int price;
	String sim;
	Mobile(String brand, int price ,String sim)
	{
		super(brand);
		this.price=price;
		this.sim=sim;
	}
	public void printMobile() {
		System.out.println(brand);
		System.out.println(price);
		System.out.println(sim);
	}
	public static void main(String[] args) {
		Mobile m = new Mobile("Samsung", 45500, "Snapdragon");
		m.printMobile();
	}
}
