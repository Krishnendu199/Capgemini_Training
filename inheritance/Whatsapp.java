package inheritance;

public class Whatsapp extends App {
	String type;
	String company;
	public Whatsapp(String type, String company,int size, boolean FreeOfCost)
	{
		this.size=size;
		this.FreeOfCost=FreeOfCost;
		this.company=company;
		this.type=type;
	}
	public void printApp()
	{
		System.out.println("Size: "+size);
		System.out.println("Type: "+type);
		System.out.println("Company: "+company);
		System.out.println("FreeOfCost: "+FreeOfCost);
	}
	public static void main(String[] args) {
		Whatsapp w = new Whatsapp("Social Media","Meta",100,true);
		w.printApp();
	}
}
