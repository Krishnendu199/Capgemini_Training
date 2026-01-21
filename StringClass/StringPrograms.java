package StringClass;

public class StringPrograms {
	// how many alphabets in the string.
	public int CountAlphabet(String s) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if ((s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') || (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')) {
				count++;
			}
		}
		return count;
	}

	public String CaseConvert(String s) {
		String s2 = "";

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			if ((s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') || (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')) {
			if (c >= 'a' && c <= 'z') {
				c = (char) (c - 32);
			} else if (c >= 'A' && c <= 'Z') {
				c = (char) (c + 32);
			}
			s2 = s2 + c;
		}
		}

		return s2;
	}
	
	public String charToString(char[] c)
	{
		String s = new String(c);
		return s;
	}
	
	//wap to remove digits from string
	//wap to count how many alphabets,digits and special character
	//wap to convert every first character of word to upper case.
	public static void main(String[] args) {
		String s = "Acb123";
		String s1 = "abc";
		String b = "abcdbe";
		StringPrograms sp = new StringPrograms();
		System.out.println(sp.CountAlphabet(s));
		System.out.println(sp.CaseConvert(s));
		System.out.println(b.substring(1));
		System.out.println(b.substring(1,4));
		
		char[] c =b.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i]);
		}
		//String st = new String(c);
		System.out.println(sp.charToString(c));
		System.out.println(b.indexOf('b'));//1
		System.out.println(b.indexOf('b',3));//start checking from 3  
 		System.out.println(b.lastIndexOf('b'));//4
	}
}
