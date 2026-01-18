package Assignment_1DArray;

public class Question26 {
	    public static void main(String[] args) {

	        int[] a = {40, 10, 30, 20, 50};
	        int n = a.length;

	        for(int i = 0; i < n; i++) {
	            for(int j = 0; j < n - i - 1; j++) {
	                if(a[j] > a[j + 1]) {
	                    int temp = a[j];
	                    a[j] = a[j + 1];
	                    a[j + 1] = temp;
	                }
	            }
	        }

	        for(int i = 0; i < n; i++)
	            System.out.print(a[i] + " ");
	    }
	}
