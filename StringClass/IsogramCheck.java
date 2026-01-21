package StringClass;

public class IsogramCheck {

	public static boolean isIsogram(String s) {

		s = s.toLowerCase();

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			if (s.indexOf(ch) != s.lastIndexOf(ch))
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		String s = "machine";

		if (isIsogram(s))
			System.out.println("Isogram");
		else
			System.out.println("Not Isogram");
	}
}
