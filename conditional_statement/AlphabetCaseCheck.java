package conditional_statement;

public class AlphabetCaseCheck {
	public static void main(String[] args) {
		char ch ='/';
		if(ch>='A' && ch<='Z') {
			System.out.println("Capital Letter");
		}
		else if(ch>='a' && ch<='z') {
			System.out.println("Small Letter");
		}
		else
			System.out.println("Not an Alphabet");
	}
}
