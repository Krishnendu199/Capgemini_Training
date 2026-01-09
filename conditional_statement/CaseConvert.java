package conditional_statement;

public class CaseConvert {
	public static void main(String[] args) {
		char ch = 'A';
		if(ch>='A' && ch<='Z') {
			ch = (char)(ch+32);
			System.out.println(ch);
		}
		else if(ch>='a' && ch<='z') {
			ch = (char)(ch-32);
			System.out.println(ch);
		}
		else
			System.out.println("Not an Alphabet");
	}
}

