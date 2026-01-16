package arrays;

//WAP to remove duplicate items from array.
public class RemoveDuplicate {
	public static int[] removeDuplicates(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];
        int k = 0;

        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;

            for (int j = 0; j < k; j++) {
                if (arr[i] == temp[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                temp[k] = arr[i];
                k++;
            }
        }

        // Copy only unique elements into result array
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = temp[i];
        }

        return result;
    }
	public static void main(String[] args) {
		int[] a = {1,1,4,5,6,6,7,8};
		int[] f = removeDuplicates(a);
		for(int i = 0;i<f.length;i++) {
			System.out.println(f[i]);
		}
	}
}
