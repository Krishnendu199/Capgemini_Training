package StringClass;

public class SwapChar {

	public void swapChar(String s) {
		String[] s1 = s.split(" ");
		String s2 = "";

		for (int i = 0; i < s1.length; i++) {
			String word = s1[i];

			if (word.length() > 1) {
				char first = word.charAt(0);
				char last = word.charAt(word.length() - 1);

				word = last + word.substring(1, word.length() - 1) + first;
			}

			s2 += word + " ";
		}

		System.out.println(s2.trim());
	}

	public static void main(String[] args) {
		SwapChar sc = new SwapChar();
		sc.swapChar("Hello hi");
	}
}
