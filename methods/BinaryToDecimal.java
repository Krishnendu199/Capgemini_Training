package methods;

import java.util.Scanner;

public class BinaryToDecimal {
	public static int binaryDecimal(int n) {
		int dec = 0, base = 1;
		while (n != 0) {
			dec += (n % 10) * base;
			base = base * 2;
			n /= 10;
		}
		return dec;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a binary number: ");
		int n = sc.nextInt();
		System.out.println("Decimal: " + binaryDecimal(n));
	}
}
