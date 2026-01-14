package methods;

import java.util.Scanner;

public class Xylem_Phloem {
	public static String isXylemPhloem(int n) {
		int last = n % 10;
		int sum = 0;
		n /= 10;

		while (n > 9) {
			int d = n % 10;
			sum += d;
			n /= 10;
		}
		int first = n;
		if (first + last == sum) {
			return "Xylem";
		} else
			return "Phloem";
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		System.out.println(isXylemPhloem(n));
	}
}
