package methods;

public class Program {
	public static void Palindrome(int n)
	{
		int temp = n, rev = 0;

        while (n != 0) {
            int digit = n %10;
        		rev = rev * 10 + digit ;
            n /= 10;
        }
        if (temp == rev)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
	}
	
	public static void Prime(int n)
	{
		for( int i =2;i<=n/2;i++) {
			if(n%i==0) {
				System.out.println("Not Prime");
				return;
			}	
		}
		System.out.println("Prime");
	}

}
