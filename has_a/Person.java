package has_a;

public class Person {
	String name;
	PanCard panCard;
	
	public static void main(String[] args) {
		Person p = new Person();
		p.name="Dinga";
		PanCard card = new PanCard();
		card.panID="ABC123";
		card.dob="14/04/2001";
		
		p.panCard=card; 
		
		System.out.println(p.name);
		System.out.println(p.panCard.panID);
		System.out.println(p.panCard.dob);
	}
}
