package arrays;

public class FindBigSmall {
	public static int[] findBigSmall(int[] a)
	{
		int big = a[0];
		int small = a[0];
		for(int i = 0; i<a.length;i++) {
			if(a[i]>big)
				big=a[i];
		}
		for(int i = 0; i<a.length;i++) {
			if(a[i]<small)
				small=a[i];
		}
		int[] c = {big,small};
		return c;
	}
	public static void main(String[] args) {
		int[] c = {1,2,3,4,5};
		int[] f = findBigSmall(c);
		for(int i=0;i<f.length;i++) {
			System.out.println(f[i]);
		}

	}
}
