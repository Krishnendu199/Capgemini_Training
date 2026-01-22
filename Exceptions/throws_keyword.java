package Exceptions;

public class throws_keyword {
	public static void main(String[] args)
	{
		try {   //need to use try-catch for handling
			m1();
		}
		catch (Exception e) {
			System.out.println("handled");
		}
	}
	
	public static void m1() throws Exception //it will not handle the exception, just inform
	{
		System.out.println("hii");
		Class.forName("arrays.Student");
		System.out.println("bye");
	}
}
