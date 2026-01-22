package Exceptions;

public class Arithmetic {
	public static void main(String[] args) {
		System.out.println("hii");
		
		try { 
			System.out.println(7/0); //risky code
		}
		catch (ArithmeticException e) {
			System.out.println("zero"); //handling
		}
		
		System.out.println("bye");
	}
}
