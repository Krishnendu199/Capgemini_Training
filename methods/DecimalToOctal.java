package methods;

import java.util.Scanner;

public class DecimalToOctal {
	public static int decimalOctal(int n)
	{
		int oct = 0, place=1;
		while(n!=0)
		{
			oct += (n%8)*place;
			place*=10;
			n/=8;
		}
		return oct;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a decimal number: ");
		int n = sc.nextInt();
		System.out.println("Octal: "+decimalOctal(n));
	}
}
