package arrays;

import java.util.Scanner;

public class SumOfEvenOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size:");
		int[] a = new int[sc.nextInt()];
		int i;
		for(i = 0; i<a.length;i++)
		{
			a[i] = sc.nextInt();
		}
		int even =0;
		int odd = 0;
		for(int i1 = 0; i1<a.length;i1++) {
			if(a[i1]%2==0) {
				even +=a[i1];
			}
			else
				odd+=a[i1];
		}
		System.out.println(even);
		System.out.println(odd);
	}
}
