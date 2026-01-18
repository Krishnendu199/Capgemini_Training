package abstraction;

public class BankDriver {
	public static void main(String[] args) {
		Bank s = new SBI();
		Bank h = new HDFC();
		s.getInterestRate();
		h.getInterestRate();
	}
}
