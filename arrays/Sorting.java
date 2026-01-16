
package arrays;

public class Sorting {

    public static int[] mergeArray(int[] a, int[] b) {

        int lenA = a.length;
        int lenB = b.length;

        int[] merge = new int[lenA + lenB];

        int i = 0, j = 0, k = 0;

        // Compare and merge
        while (i < lenA && j < lenB) {
            if (a[i] <= b[j]) {
                merge[k] = a[i];
                k++;
                i++;
            } else {
                merge[k++] = b[j++];
            }
        }

        // Copy remaining elements
        while (i < lenA) {
            merge[k++] = a[i++];
        }

        while (j < lenB) {
            merge[k++] = b[j++];
        }

        return merge;
    }

    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7};
        int[] b = {2, 4, 6, 8};

        int[] result = mergeArray(a, b);

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
