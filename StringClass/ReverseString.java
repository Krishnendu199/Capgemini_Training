package StringClass;

public class ReverseString {
	public void reverseString(String s) {
		String[] s1 = s.split(" ");
		int start = 0;
		int end = s1.length - 1;

		while (start < end) {
			String temp = s1[start];
			s1[start] = s1[end];
			s1[end] = temp;

			start++;
			end--;
		}

		for (int i = 0; i < s1.length; i++) {
			System.out.print(s1[i] + " ");
		}
	}

	public static void main(String[] args) {
		ReverseString s = new ReverseString();
		s.reverseString("xyz gyg huh");
	}
}
