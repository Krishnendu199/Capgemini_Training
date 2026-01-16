package arrays;

import java.util.Scanner;

public class Example2 {
	public static void takeIntArray()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size:");
		int[] a = new int[sc.nextInt()];
		for(int i = 0; i<a.length;i++)
		{
			a[i] = sc.nextInt();
		}
		for(int i = 0; i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
	
	public static void takeCharArray()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size:");
		char[] a = new char[sc.nextInt()];
		for(int i = 0; i<a.length;i++)
		{
			a[i] = sc.next().charAt(0);
		}
		for(int i = 0; i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
	
	public static void takeStringArray()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size:");
		String[] a = new String[sc.nextInt()];
		for(int i = 0; i<a.length;i++)
		{
			a[i] = sc.next();
		}
		for(int i = 0; i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
	
	public static void takeBooleanArray()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size:");
		boolean[] a = new boolean[sc.nextInt()];
		for(int i = 0; i<a.length;i++)
		{
			a[i] = sc.nextBoolean();
		}
		for(int i = 0; i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
	
	public static void main(String[] args) {
		takeStringArray();
	}
}
