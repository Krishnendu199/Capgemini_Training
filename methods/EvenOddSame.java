package methods;

public class EvenOddSame {
	public static boolean evenOddSame(int n) {
		int even = 0;
		int odd = 0;
		while (n != 0) {
			int digit = n % 10;
			if (digit % 2 == 0) {
				even++;
			} else
				odd++;
			n = n / 10;
		}
		if (even == odd)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		int n = 121212;
		if (evenOddSame(n)) {
			System.out.println("Even and Odd digits are same in " + n);
		} else {
			System.out.println("Even and Odd digits are not same in " + n);
		}
	}
}
