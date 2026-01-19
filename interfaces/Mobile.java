package interfaces;

public interface Mobile {
	void proccesor();
	void storage();
}

class Redmi implements Mobile
{
	public void proccesor() {
		System.out.println("Snapdragon");
	}
	public void storage() {
		System.out.println("128GB");
	}
}

class iPhone implements Mobile
{
	public void proccesor() {
		System.out.println("A18");
	}
	public void storage() {
		System.out.println("512GB");
	}
}
