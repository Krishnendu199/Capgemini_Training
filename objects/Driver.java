package objects;

public class Driver {
//	public static void main(String[] args) {
//		EncapsulationTrainer t = new EncapsulationTrainer(15,"Raj",456);
//		t.setName("Raghav");
//		System.out.println("ID:"+ t.getId());
//		System.out.println("Name:"+t.getName());
//		System.out.println("Pass:"+t.getPass());
//	}
	public static void main(String[] args) {
		Account ac = new Account();
		ac.setId(101);
		ac.setBalance(1000);
		ac.setPass(123);
		System.out.println("ID: "+ac.getId());
		System.out.println("Balance: "+ac.getBalance(123));
		System.out.println("Pass: "+ac.getPass());
	}
}
