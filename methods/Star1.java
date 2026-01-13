package methods;

public class Star1 {
	public static void p2(int r)
	{
		for(int i=0;i<=r;i++) {
			for(int j=i;j>r-i;j--)
			{
				System.out.print("*");
			}
			for(int k =1;k>i;k--)
				System.out.print(" ");
			System.out.println();
		}
	}
	public static void p3(int r)
	{
		for(int i=0;i<=r;i++) {
			for(int j=0;j<r-i;j++)
			{
				System.out.print("*");
			}
			for(int k =1;k<=i;k++)
				System.out.print(" ");
			System.out.println();
		}
	}
	public static void main(String[] args) {
		p2(3);
	}
}
