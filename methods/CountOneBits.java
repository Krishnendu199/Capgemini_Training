package methods;

import java.util.Scanner;

public class CountOneBits {
	public static int countOneBits(int n)
	{
		int count = 0;
		while(n!=0)
		{
			int r = n%2;
			if(r==1)
			{
				count++;
			}
			n/=2;
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a decimal number: ");
		int n = sc.nextInt();
		System.out.println("Number of 1 bits: "+countOneBits(n));
	}
}
