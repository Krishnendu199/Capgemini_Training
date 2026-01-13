package methods;

public class Constructor_Product {
	int id;
	String name;
	double price;
	double rating;
	public Constructor_Product(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	public Constructor_Product(int id,String name,double price)
	{
		this(id,name);
		this.price=price;
	}
	public Constructor_Product(int id,String name,double price,double rating)
	{
		this(id,name,price);
		this.rating=rating;
	}
	public void display()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(price);
		System.out.println(rating);
		System.out.println();
	}
	public static void main(String[] args) {
		Constructor_Product cp1 = new Constructor_Product(101, "Shampoo");
		cp1.display();
		Constructor_Product cp2 = new Constructor_Product(102, "Pencil",6.7);
		cp2.display();
		Constructor_Product cp3 = new Constructor_Product(103, "Sugar",89.60,4.6);
		cp3.display();
		
	}
}
