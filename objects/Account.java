package objects;

public class Account {
	private int id;
	private int balance;
	private int pass;
	
	public void setBalance(int balance)
	{
		if(balance>0)
		{
			this.balance=balance;
		}
		else
			System.out.println("Invalid!!");
	}
	public void setPass(int pass)
	{
		this.pass=pass;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	
	public int getId()
	{
		return id;
	}
	public int getBalance(int pass)
	{
		if(this.pass==pass)
			return balance;
		else
			System.out.println("Incorrect Pass");
			return 0;
	}
	public int getPass()
	{
		return pass;
	}
}
