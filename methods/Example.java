package methods;

public class Example {
	//called method
	public static void m1() {
		System.out.println("M1");
	}
	//caller main method
	public static void main(String[] args) {
		System.out.println("Main");
		m1(); // method call statement
	}
}
