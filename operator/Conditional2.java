package operator;

public class Conditional2 {
	public static void main(String[] args) {
		int a = 8, b=68, c=77, d =10;
		int big = (a>b)?a:b;
		big = (big>c)?big:c;
		big = (big>d)?big:d;
		System.out.println("biggest num:" + big);
		System.out.println(a>b && a>c && a>d? "a is greatest": (b>c && b>d)?"b is greatest" : (c>d)?"c is greatest":"d is greatest");
	}
}
