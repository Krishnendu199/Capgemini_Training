package Loops;

public class AverageDigit {
	public static void main(String[] args) {
		int n = 15677;
		int count = 0;
		int sum =0;
		while(n!=0) {
			int digit = n%10;
			n/=10;
			sum+=digit;
			count ++;
		}
		System.out.println(sum/count);
	}

}
