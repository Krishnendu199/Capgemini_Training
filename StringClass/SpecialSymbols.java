package StringClass;

public class SpecialSymbols {
	public static void countSpecial(String s) {

		int count = 0;

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			if (!((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9') || ch == ' ')) {

				System.out.print(ch + " ");
				count++;
			}
		}

		System.out.println("\nCount = " + count);
	}

	public static void main(String[] args) {
		String s = "Hello@123#World$!";
		countSpecial(s);
	}
}
