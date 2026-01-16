package arrays;

public class Parameterized {
	public static void printArray(int[] a)
	{
		for(int i =0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
	public static void main(String[] args) {
		int[]a= {10,20,30};
		printArray(a);
	}
}
