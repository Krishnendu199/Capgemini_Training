package methods;

public class BankAccount {
    int accNo;
    String holderName;
    double balance;

    public void deposit() {
        System.out.println(holderName + " deposited money");
    }

    public void printAccount() {
        System.out.println(accNo);
        System.out.println(holderName);
        System.out.println(balance);
    }

    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        BankAccount b2 = new BankAccount();

        b2.accNo = 1001;
        b2.holderName = "Sita";
        b2.balance = 25000;

        b2.deposit();
        b2.printAccount();

        b1.deposit();
        b1.printAccount();
    }
}
