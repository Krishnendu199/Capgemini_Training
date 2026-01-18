package Assignment_1DArray;

public class Question18 {
	public static void main(String[] args) {
		int[]a = {10,20,31,43,50};
		int n = a.length;
        int pos = 2;  

        int[] b = new int[n - 1];   

        for (int i = 0; i < pos; i++)
            b[i] = a[i];

        for (int i = pos + 1; i < n; i++)
            b[i - 1] = a[i];

        for (int i = 0; i < b.length; i++)
            System.out.print(b[i] + " ");
	}
}
