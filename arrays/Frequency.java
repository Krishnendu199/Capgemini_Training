package arrays;

public class Frequency {

    public static void elementFrequency(int[] a) {

        for (int i = 0; i < a.length; i++) {
            int count = 1;

            // Skip if already counted
            if (a[i] == -1)
                continue;

            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    count++;
                    a[j] = -1;   // mark as counted
                }
            }

            System.out.println("Frequency of " + a[i] + " is: " + count);
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 1, 3, 4, 5, 6, 6};
        elementFrequency(a);
    }
}
