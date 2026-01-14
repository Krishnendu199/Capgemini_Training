package methods;

public class GreatestSmallest {
	public static void great(int a, int b, int c) {
		int big = a;
		if(b>big) {
			big =b;
		}
		if (c>big) {
			big =c;
		}
		System.out.println(big);	
	}
	public static void small(int a, int b, int c) {
		int small = a;
		if(b<small)
			small =b;
		if(c<small)
			small = c;
		System.out.println(small);
			
	}
	public static void main(String[] args) {
		great(4, 6, 8);
		small(4, 6, 8);
	}

}
