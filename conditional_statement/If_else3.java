package conditional_statement;

public class If_else3 {
	public static void main(String[] args) {
		char c = '1';
		if ((c >= 'A' && c <= 'Z') || (c>='a' && c<='z'))
		{
			System.out.println("Alphabet");
		}
		else if (c>='0' && c<='9')
		{
			System.out.println("Digit");
		}
		else
			System.out.println("Special character");
	}

}
