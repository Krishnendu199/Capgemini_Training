package Exceptions;

public class MultipleCatch {
public static void main(String[] args) {
	System.out.println("hii");
	try {
		System.out.println(7/7);
		Class.forName("arrays.Student");
		String s=null;
		s.toLowerCase();
	}
	catch (ClassNotFoundException e) {
		System.out.println("class info is wrong");
	}
	catch (ArithmeticException e) {
		System.out.println("dividing by zero");
	}
	catch (Exception e) {
		System.out.println("Something went wrong");
	}
}
}
