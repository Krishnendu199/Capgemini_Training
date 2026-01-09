package conditional_statement;

public class DivisibleCheck {
    public static void main(String[] args) {
        int num = 15;

        if (num % 3 == 0 && num % 5 == 0)
            System.out.println("Divisible by 3 and 5");
        else
            System.out.println("Not divisible by 3 and 5");
    }
}
