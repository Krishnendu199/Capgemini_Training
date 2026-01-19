package has_a;

public class Human {
	private Heart heart;
	private Address address;
	public Human() {
		heart = new Heart(); //Composition
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public static void main(String[] args) {
		Human human = new Human();
		human.heart.pump();
		human.setAddress(new Address()); //aggregation
		human.getAddress().location();
	}
}
class Heart {
	public void pump() {
		System.out.println("heart is pumping!!");
	}
}

class Address {
	public void location() {
		System.out.println("India");
	}
}

