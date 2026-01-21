package StringClass;

public class StringPrograms2 {
	
	//wap to remove digits from string.
	//wap to count how many alphabets,digits and special character.
	//wap to convert every first character of word to upper case(don't take number as first char).
	
	public String removeDigits(String s)
	{
		String s2 = "";

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			if ((s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') || (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')) {
				
				s2 = s2 + c;
		}
		}

		return s2;
	}
	
	public String countAll(String s)
	{
		int count_alp=0;
		int count_dig=0;
		int count_spc=0;
		
		for (int i = 0; i < s.length(); i++) {
			char c=s.charAt(i);
			if ((c >= 'A' && c <= 'Z') ||( c >= 'a' && c <= 'z')) {
				count_alp++;
			}
			else if(c>='1' && c<='9')
			{
				count_dig++;
			}
			else
				count_spc++;
		}
		return "Alphabet"+count_alp+" Digit:"+count_dig+" SpecialChar:"+count_spc;
	}
	
	public void firstCharUpper(String s)
	{
		String s1="";
		s1=s1+s.charAt(0);
		s1=s1.toUpperCase();
		for(int i=1;i<s.length();i++)
		{
			if(s.charAt(i) == ' ')
				s1+=s.charAt(i);
			if(s.charAt(i-1)==' ') {
				s1+=Character.toUpperCase(s.charAt(i));
			}
			else {
				s1+=s.charAt(i);
			}

		}
		
		System.out.println(s1);
	}
	
	public static void main(String[] args) {
		String s = "Abc123 Hi hello";
		StringPrograms2 sp = new StringPrograms2();
		System.out.println(sp.removeDigits(s));
		System.out.println(sp.countAll(s));
		sp.firstCharUpper(s);
	}
}
