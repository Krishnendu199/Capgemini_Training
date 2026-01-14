package methods;

import java.util.Scanner;

public class HappyNumber {
	static boolean isHappy(int num) {
	    while (num > 9) {
	        int sum = 0;
	        while (num != 0) {
	            int d = num % 10;
	            sum += d * d;
	            num /= 10;
	        }
	        num = sum;
	    }
	    if(num == 1)
	    		return true;
	    else
	    		return false;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		if(isHappy(n))
			System.out.println("Happy Number");
		else
			System.out.println("Not Happy Number");
	}

}
