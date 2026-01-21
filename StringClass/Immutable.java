package StringClass;

public class Immutable {
	public static void main(String[] args) {
		String s = "abc";
		s=s.toUpperCase(); //Storing ABC in separate memory and refer to s.
		System.out.println(s);
		char[] c = {'a','b','c'};
		String sc = new String(c);
		System.out.println(sc);
		System.out.println(s.charAt(2));
		System.out.println(s.length());
	}
}
