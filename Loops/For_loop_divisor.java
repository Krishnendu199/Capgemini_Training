package Loops;

public class For_loop_divisor {
	public static void main(String[] args) {
		int n = 30;
		int count =0;
		for (int i =1; i<=n;i++)
		{
			if(n%i==0)
			{
				count +=1;
			}
		}
		System.out.println(count);
	}

}
