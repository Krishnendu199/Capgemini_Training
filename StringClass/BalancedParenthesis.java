package StringClass;

public class BalancedParenthesis {

	public static boolean checkBalance(String s) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			if (ch == '(')
				count++;
			else if (ch == ')')
				count--;

			if (count < 0)
				return false;
		}
		return count == 0;
	}

	public static void main(String[] args) {
		String s = "(a+b)*(c+d)";

		if (checkBalance(s))
			System.out.println("Balanced");
		else
			System.out.println("Not Balanced");
	}
}
