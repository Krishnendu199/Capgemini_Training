package conditional_statement;

public class If_else {
	public static void main(String[] args) {
		int a = 50,b=45,c=34, big;
		if(a>b && a>c)
		{
			big =a;
		}
		else
		{
			big = (b>c)?b:c;
		}
		
		System.out.println(big);
	}
}
