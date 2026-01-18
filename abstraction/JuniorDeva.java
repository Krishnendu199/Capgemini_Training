package abstraction;

public class JuniorDeva extends Deva
{
	
	@Override
	public void goldLoan() {
		System.out.println("JuniorDeva paid Gold Loan");
	}
	
	public static void main(String[] args) {
		JuniorDeva jd = new JuniorDeva();
		jd.homeLoan();
		jd.goldLoan();
		
		Parent p = new JuniorDeva();
		p.homeLoan();
		p.goldLoan();

		Deva d = new JuniorDeva();
		d.homeLoan();
		d.goldLoan();
	}
}
