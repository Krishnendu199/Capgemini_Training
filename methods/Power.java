package methods;

public class Power {
	public static int power(int base, int power) {
		int a =1;
		for(int i = 0; i<power;i++) {
			a = a* base;
		}
		return a;
	}
	public static int count(int n) {
		int count = 0;
		while(n!=0) {
			count++;
			n /=10;
		}
		return count;
	}
	public static int armstrong(int n) {
		int count= count(n);
		int sum = 0;
		while(n!=0) {
			int digit = n % 10;
			n = n /10;
			sum = sum + power(digit,count);
		}
		return sum;
	}
	public static void main(String[] args) {
		System.out.println(power(5,2));
		System.out.println(count(233));
		int n = 1634;
		if(armstrong(n) == n) {
			System.out.println("Armstrong");
		}
		else {
			System.out.println("Not Armstrong");
		}
	}
}
