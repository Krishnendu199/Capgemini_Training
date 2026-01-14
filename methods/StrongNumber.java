package methods;

import java.util.Scanner;

public class StrongNumber {
	public static boolean isStrong(int n) {
		int temp = n, sum = 0;
		while (n != 0) {
			int d = n % 10;
			int fact = 1;
			while (d > 0) {
				fact = fact * d;
				d--;
			}
			sum += fact;
			n /= 10;
		}
		if (temp == sum)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		if (isStrong(n))
			System.out.println("Strong Number");
		else
			System.out.println("Not Strong Number");
	}

}
