package arrays;

public class MergeZigZag {
	public static int[] mergeArray(int[] a, int[] b) {
        int len_a = a.length;
        int len_b = b.length;

        int i = 0, j = 0, k = 0;
        int[] merge = new int[len_a + len_b];

        while (i < len_a && j < len_b) {
        		merge[k++] = a[i++];
        		merge[k++] = b[j++];
        }
        while (i < len_a) {
            merge[k++] = a[i++];
        }
        while (j < len_b) {
            merge[k++] = b[j++];
        }

        return merge;
    }

    public static void main(String[] args) {
        int[] c = {1, 2, 3, 4, 5};
        int[] f = {7, 8, 9};

        int[] s = mergeArray(c, f);

        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }
}
