package StringClass;

public class Demo {
	
	public static void main(String[] args) {
		String a = "xyz";
		String b = "xyz";
		String c = "abc";
		
		System.out.println(a.toString());
		System.out.println(a.equals(b));
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		System.out.println(c.hashCode());
		
		String s1 = new String("xyz");
		String s2 = "abc";
		String s3 = "xyz";
		String s4 = new String("xyz");
		String s5 = new String("abc");
		String s6 = "abc";
		System.out.println(s1.equals(s3)); //content is checked
		System.out.println(s1==s3);  //address is checked
		System.out.println(s4.equals(s5)); //false
		System.out.println(s4==s5); //false
		System.out.println(s1.equals(s4)); //true
		System.out.println(s1==s4); //false
		System.out.println(s2==s6); //true
		
		
	}
}
