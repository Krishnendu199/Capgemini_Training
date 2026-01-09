package conditional_statement;

public class Calculator {
	public static void main(String[] args) {
		int a = 50, b=20; 
		char ch = '+';
		switch (ch) {
		case '+':
		{
			System.out.println(a+b);
		}
		break;
		case '-':
		{
			System.out.println(a-b);
		}
		break;
		case '*':
		{
			System.out.println(a*b);
		}
		break;
		case '/':
		{
			System.out.println(a/b);
		}
		break;
		default:
		{
			System.out.println("no match");
		}
		break;
		}
	}
}
