package StringClass;

public class MaxVowels {
	public static void maxVowels(String s)
	{
		String[] saar = s.split(" ");
		int maxCount=0;
		String maxWord="";
		for(int i=0;i<saar.length;i++)
		{
			String w = saar[i];
			int count=0;
			
			for(int j=0;j<w.length();j++)
			{
				char ch = Character.toLowerCase(w.charAt(j));
				 if (ch == 'a' || ch == 'e' || ch == 'i' ||ch == 'o' || ch == 'u') 
		                count++;
			}
			
			if(count>maxCount)
			{
				maxCount=count;
				maxWord=w;
			}
		}
		System.out.println(maxWord);
	}
	public static void main(String[] args) {
		maxVowels("I love programming");
	}
}
