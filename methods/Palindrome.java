package methods;

public class Palindrome {
	public static String isPalindrome(int n) {
		int temp = n;
		int rev = 0;
		while(n!=0) {
			int d = n%10;
			rev = rev*10+d;
			n /=10;
		}
		if(rev == temp)
			return "good";
		else
			return "bad";
	}
	public static void main(String[] args) {
		System.out.println(isPalindrome(12321));
	}

}
