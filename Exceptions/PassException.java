package Exceptions;

public class PassException extends RuntimeException
{ 
	public PassException(String msg)
	{
		super(msg);    
	}
	
	public static void enterPass(String pass)
	{
		if(pass=="K123K")
		{
			System.out.println("Login Successful!!");
		}
		else
		{
			throw new PassException("Invalid PassWord!!");
		}
	}
	public static void main(String[] args) {
		enterPass("K123K");
	}
}
