package StringClass;

public class LastCharLowerCase {
	public void lastCharLower(String s)
	{
		String s1="";
		for(int i=0;i<s.length()-1;i++)
		{
			if(s.charAt(i+1)==' ') {
				s1+=Character.toLowerCase(s.charAt(i));
			}
			else {
				s1+=s.charAt(i);
			}
		}
		
		String f = "";
		f+=Character.toLowerCase(s.charAt(s.length()-1));
		s1+=f;
		System.out.println(s1);
	}
	public static void main(String[] args) {
		String s = "HellO JavA";
		LastCharLowerCase l = new LastCharLowerCase();
		l.lastCharLower(s);
	}
}
