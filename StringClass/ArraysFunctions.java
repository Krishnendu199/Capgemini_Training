package StringClass;

import java.util.Arrays;

public class ArraysFunctions {
	public static void main(String[] args) {
	
		char[] ch = {'b','c','a'};
		char[] ch1 = {'b','c','a'};
		
		Arrays.sort(ch);
		System.out.println(Arrays.toString(ch));
		Arrays.sort(ch1);
		System.out.println(Arrays.toString(ch1));
		
		System.out.println(Arrays.binarySearch(ch, 'a'));
	}
	
}
