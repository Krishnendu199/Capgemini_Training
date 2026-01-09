package Loops;

public class OddNumbers {
    public static void main(String[] args) {
        int n1 = 10, n2 = 25;

        while (n1 <= n2) {
            if (n1 % 2 != 0)
                System.out.println(n1);
            n1++;
        }
    }
}
