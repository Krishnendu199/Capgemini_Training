package Loops;

public class For_loop_prime {
	public static void main(String[] args) {
		int n = 29;
		int count =0;
		for (int i = 2; i<=n;i++)
		{
			if(n%i==0) {
				count++;
			}
		}
		if(count>2) {
			System.out.println("non-prime");
		}
		else {
			System.out.println("prime");
		}
	}

}
