package Loops;

public class While_num_even {
	public static void main(String[] args) {
		int n = 10;
		int i = 1;
		while(i<=n) {
			if(n%2==0) {
				System.out.println(i);
			}
			i++;
		}
	}
}
