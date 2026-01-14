package objects;

public class EncapsulationStudent {
	String name;
	private int pass;
	
	public int getPass() {
		return pass;
	}
	
	public void setPass(int pass)
	{
		this.pass = pass;
	}
	public static void main(String[] args) {
		EncapsulationStudent s = new EncapsulationStudent();
		s.name = "Raju";
		s.setPass(123);
		System.out.println(s.name);
		System.out.println(s.getPass());
	}
}
