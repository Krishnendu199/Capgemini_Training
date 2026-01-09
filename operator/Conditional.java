package operator;

public class Conditional {
	public static void main(String[] args) {
		int n=7;
		System.out.println(true?"smt1":"smt2");
		System.out.println(false?"smt1":"smt2");
		String res = (n%2==0)? "Even":"Odd";
		System.out.println(res);
		
	}
}
