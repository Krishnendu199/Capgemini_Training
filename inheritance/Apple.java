package inheritance;

public class Apple extends Fruit {
	int price;
	public Apple(String name, String color)
	{
		this.name=name;
		this.color=color;
	}
	public void printFruit() {
		System.out.println(name);
		System.out.println(color);
		System.out.println(price);
	}
	public static void main(String[] args) {
		Apple a = new Apple("Kashmiri","red");
		a.printFruit();
	}
}
