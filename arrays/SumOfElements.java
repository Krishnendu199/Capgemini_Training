package arrays;

import java.util.Scanner;

public class SumOfElements {
	public static void SumArray()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size:");
		int[] a = new int[sc.nextInt()];
		int sum =0;
		for(int i = 0; i<a.length;i++)
		{
			a[i] = sc.nextInt();
		}
		for(int i = 0; i<a.length;i++)
		{
			sum+=a[i];
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		SumArray();
	}
}
