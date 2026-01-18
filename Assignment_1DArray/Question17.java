package Assignment_1DArray;

public class Question17 {
	public static void main(String[] args) {
		int[]a = {10,20,30,40,50};
		int n = a.length;
		int pos = 2;      
		int val = 99;

		int[] b = new int[n + 1];   

		for (int i = 0; i < pos; i++)
		    b[i] = a[i];

		b[pos] = val;

		for (int i = pos; i < n; i++)
		    b[i + 1] = a[i];

		for (int i = 0; i < b.length; i++)
		    System.out.print(b[i] + " ");
	}
}
