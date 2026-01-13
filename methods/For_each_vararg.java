package methods;

public class For_each_vararg {
	public static void main(String[] args) {
		add();
		add(5,10,15,20);   
	}
	public static void add(int... n)
	{
		int sum=0;
		for(int i :n)
		{
			sum=sum+i;
		}
		System.out.println(sum);
	}
}
