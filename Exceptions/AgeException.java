package Exceptions;

public class AgeException extends RuntimeException
{ 
	public AgeException(String msg)
	{
		super(msg);
	}
	
	public static void ageCheck(int age)
	{
		if(age>0)
		{
			System.out.println("Age is Valid");
		}
		else
		{
			throw new AgeException(age+" is invalid!!");
		}
	}
	public static void main(String[] args) {
		int age=10;
		ageCheck(age);
		try
		{
			ageCheck(-6);
		}
		catch (AgeException e) {
			System.out.println("Age Exception handled");
		}
	}
}
