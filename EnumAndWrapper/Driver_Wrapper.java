package EnumAndWrapper;

public class Driver_Wrapper {
	public static void main(String[] args) {
		int n=10;
		Integer i=n; //auto boxing
		int n2 = i; //auto unboxing
		
		Integer e = Integer.valueOf("123");
		System.out.println(e+1);
		
		Boolean b = Boolean.valueOf("Tru"); //default-false
		System.out.println(b);
		
		Integer e1 = Integer.valueOf("123a"); //NumberFormatException
		
		String s = Integer.toString(23);
		
		Long l = Long.parseLong("567"); 
		
	}
}
