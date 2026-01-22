package Exceptions;

public class finally_keyword {
	public static void main(String[] args) {
		try
		{
			System.out.println(7/7);
		}
		catch(NullPointerException e)
		{
			System.out.println("handled");
		}
		finally {
			System.out.println("finally block");
		}
	}
	
}
