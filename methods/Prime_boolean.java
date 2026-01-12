package methods;

public class Prime_boolean {
	public static boolean isPrime(int n) {
		for(int i = 2;i<=n;i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		if(isPrime(20))
			System.out.println("Prime");
		else
			System.out.println("Not Prime");
	}
}
