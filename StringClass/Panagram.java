package StringClass;

public class Panagram {
	public String isPanagram(String s)
	{
		s=s.toLowerCase();
		boolean p = true;
		for(int i='a';i<='z';i++)
		{
			if(s.indexOf(i)==-1)
			{
				p=false;
				break;
			}
		}
		if(p)
		{
			return "Is Panagram";
		}
		else
			return "Not Panagram";
	}
	public static void main(String[] args) {
		Panagram p = new Panagram();
		System.out.println(p.isPanagram("The quick brown fox jumps over the lazy dog"));
	}
}
