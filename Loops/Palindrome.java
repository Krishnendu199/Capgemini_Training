package Loops;

public class Palindrome {
    public static void main(String[] args) {
        int num = 121;
        int temp = num, rev = 0;

        while (num != 0) {
            int digit = num %10;
        		rev = rev * 10 + digit ;
            num /= 10;
        }

        if (temp == rev)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}

