package objects;

public class College {
	String name;
	String location;
	public void exam()
	{
		System.out.println(name+" is taking the exam");
	}
	public void printCollege()
	{
		System.out.println(name);
		System.out.println(location);
	}
	public static void main(String[] args) {
		College clg1 = new College();
		College clg2 = new College();
		clg1.name = "IEM";
		clg1.location="Salt Lake";
		clg1.exam();
		clg1.printCollege();
		clg2.name = "UEM";
		clg2.location="New Town";
		clg2.exam();
		clg2.printCollege();
	}
}
