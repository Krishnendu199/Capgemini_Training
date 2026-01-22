package Exceptions;

public class Examples {
	public static void expNull()
	{
		try {
			String s=null;
			System.out.println(s.toLowerCase());
		}
		catch (NullPointerException e) {
			System.out.println("Null Pointer Exception");
		}
		System.out.println("Null handled!!");
	}
	public static void expStr()
	{
		try {
			String s="xyz";
			System.out.println(s.charAt(8));
		}
		catch (Exception e) {
			System.out.println("String Index Expection");
		}
		System.out.println("String handled!!");
	}
	
	public static void expArray()
	{
		try {
			int[] a = new int[5];
			for(int i=-1;i<=7;i++)
			{
				System.out.println(a[i]);
			}
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index Expection");
		}
		System.out.println("Array handled!!");
	}
	
	public static void main(String[] args) {
		expNull();
		expArray();
		expStr();
	}
}
