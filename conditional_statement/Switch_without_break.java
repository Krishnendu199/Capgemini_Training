package conditional_statement;

public class Switch_without_break {
	public static void main(String[] args) {
		switch (4) {
		case 1:
		{
			System.out.println("c1");
		}
		case 2:
		{
			System.out.println("c2");
		}
		case 3:
		{
			System.out.println("c3");
		}
		case 4:
		{
			System.out.println("c4");
		}
		default:
		{
			System.out.println("no match");
		}
		}
	}
}
