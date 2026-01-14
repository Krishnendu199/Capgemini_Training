package methods;

public class NonStaticBlock {
	{
		System.out.println("N-S 1");
	}
	{
		System.out.println("N-S 2");
	}
	public static void main(String[] args) {
		System.out.println("main Start");
		NonStaticBlock ns = new NonStaticBlock();
		NonStaticBlock ns2 = new NonStaticBlock();
		System.out.println("main End");
	}

}
