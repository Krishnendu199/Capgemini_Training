package StringClass;

public class BufferBuilder {
	public static void main(String[] args) {
		StringBuffer s1= new StringBuffer("xyz"); 
		StringBuffer s2= new StringBuffer("xyz"); 
		System.out.println(s1);
		System.out.println(s1.toString());
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
		System.out.println(s1.reverse());
		s1.append(" java");
		System.out.println(s1);
		
		String s = new String(s1); //convert SB -> String 
		
		StringBuffer s3 = new StringBuffer(s1); //convert String -> SB
		
		StringBuffer s5 = new StringBuffer("xyz tyudj");
		s5.delete(0, 4);
		System.out.println(s5);
		s5.insert(2, "yuuy");
		System.out.println(s5);
		
		s5.replace(0, 3, "hii");
		System.out.println(s5);
		StringBuilder s4 = new StringBuilder("abc");
		System.out.println(s4.capacity());
	}
}
