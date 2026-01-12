package methods;

import java.util.Scanner;

public class DisariumNumber {
	public static boolean isDisarium(int n) {
		int temp = n, sum = 0, count = 0;
		int t = n;
		while (t != 0) {
			count++;
			t /= 10;
		}
		while (n != 0) {
			int d = n % 10;
			int pow = 1, p = count;
			while (p > 0) {
				pow = pow * d;
				p--;
			}
			sum += pow;
			count--;
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
		if (isDisarium(n))
			System.out.println("Disarium Number");
		else
			System.out.println("Not Disarium Number");
	}
}
