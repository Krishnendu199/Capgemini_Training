package methods;

import java.util.Scanner;

public class DecimalToBinary {
	public static int decimalBinary(int n)
	{
		int bin = 0, place = 1;
		while(n!=0) {
			int r = n%2;
			bin += r*place;
			place*=10;
			n/=2;
		}
		return bin;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a decimal number: ");
		int n = sc.nextInt();
		System.out.println("Binary: "+decimalBinary(n));
	}
}
