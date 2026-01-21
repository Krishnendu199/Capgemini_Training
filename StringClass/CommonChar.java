package StringClass;

public class CommonChar {
	public void common(String a, String b) {
		a = a.toLowerCase();
		b = b.toLowerCase();

		for (int i = 0; i < a.length(); i++) {
			char ch = a.charAt(i);
			if (a.indexOf(ch) != i)
				continue;
			for (int j = 0; j < b.length(); j++) {
				if (ch == b.charAt(j)) {
					System.out.print(ch + " ");
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		CommonChar c = new CommonChar();
		c.common("apple", "grape");
	}
}
