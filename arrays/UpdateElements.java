package arrays;

public class UpdateElements {
	public static void updateElements(int[] a)
	{
		int sum =0;
		int i =0;
		while(a[i]!=0) {
			int d = a[i]%10;
			sum+=d;
			a[i]/=10;
			i++;
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		int[] a = {10,20,30,40};
		updateElements(a);
	}
}
