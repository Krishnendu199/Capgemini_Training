package Assignment_1DArray;

public class Question22 {
	public static void main(String[] args) {

        int[] a = {10, 40, 20, 30, 50};
        int n = a.length;

        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                if(a[i] < a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        int k = 2;
        System.out.println(a[k - 1]);
    }
}
