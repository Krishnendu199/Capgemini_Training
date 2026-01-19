package interfaces;

public class PersonDriver {
	public static void main(String[] args) {
		Person p = new Person();
		p.setM(new iPhone());
		Mobile m1 = p.getM();
		m1.proccesor();
		m1.storage();
		
		p.setM(new Redmi());
		Mobile m2 = p.getM();
		m2.proccesor();
		m2.storage();
	}
}
