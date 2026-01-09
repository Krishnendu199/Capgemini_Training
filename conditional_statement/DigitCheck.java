package conditional_statement;

public class DigitCheck {
    public static void main(String[] args) {
        int num = -9;

        if (num >= -9 && num <= 9)
            System.out.println("Single Digit Number");
        else if ((num >= 10 && num <= 99) || (num <= -10 && num >= -99))
            System.out.println("Double Digit Number");
        else
            System.out.println("More than Double Digit");
    }
}

