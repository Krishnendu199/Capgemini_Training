package conditional_statement;

public class If_else2 {
	public static void main(String[] args) {
		int a = 50,b=45,c=34,d=56, big=a;
		if(b>big)
			big =b;
		if(c>big)
			big = c;
		if(d>big)
			big=d;
		System.out.println(big);
	}

}
