package abstraction;

public class Redmi3 extends Redmi2{
	@Override
	public void smartCamera ()
	{
		System.out.println("Smart Camera Working");
	}
	public static void main(String[] args) {
		Redmi3 r3 = new Redmi3();
		r3.smartCamera();
		Redmi2 r2 = new Redmi3();
		r2.smartCamera();
		Redmi1 r1 = new Redmi3();
		//r1.smartCamera(); //Not possible as smartCamera is implemented in Redmi2.
		Mobile m = new Redmi3();
		m.battery();
		m.camera();
	}
}
