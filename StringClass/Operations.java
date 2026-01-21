package StringClass;

public class Operations {
	public static void main(String[] args) {
		String s = "i love java";
		System.out.println(s.contains("love"));//true
		System.out.println(s.contains("python"));//false
		
		String s2 = "hi,bye,java";
		String[] str=s2.split(",");
		for(int i=0;i<str.length;i++)
		{
			System.out.println(str[i]);
		}
		
		String s1="java";
		String s3="JAVA";
		System.out.println(s1.equalsIgnoreCase(s3));//true
		System.out.println(s1.equals(s3)); //false
		
		String a ="helloworld";
		System.out.println(a.startsWith("he"));//true
		System.out.println(a.startsWith("gi"));//false
		System.out.println(a.endsWith("ld"));//true
		System.out.println(a.endsWith("he"));//false
		
		int n=100;
		String s4 =null;
		s4=s4.valueOf(n);
		System.out.println(s4);
		
		String s5="";
		System.out.println(s5.isEmpty());//len=0, it counts spaces.
		System.out.println(s5.isBlank());//does not count spaces.
		
		String s6="hi hi hi";
		System.out.println(s6.replace("hi", "bye"));
		System.out.println(s6.replaceFirst("hi", "bye"));
		
		String s7="  hi hi hi  ";
		System.out.println(s6.stripLeading()); //removes the starting spaces
		System.out.println(s6.stripTrailing()); //removes the ending spaces.
		
		
	}
}
