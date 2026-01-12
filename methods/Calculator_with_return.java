package methods;

public class Calculator_with_return {
	public static int add(int a, int b) {
		int res = a + b;
		return (res);
	}

	public static int sub(int a, int b) {
		int res = a - b;
		return (res);
	}

	public static int mul(int a, int b) {
		int res = a * b;
		return (res);
	}

	public static int div(int a, int b) {
		int res = a / b;
		return (res);
	}

	public static void main(String[] args) {
		int a = 30;
		int b = 20;
		int ch = '-';
		switch (ch) {
		case '+':
			System.out.println(add(a, b));
			break;
		case '-':
			System.out.println(sub(a, b));
			break;
		case '*':
			System.out.println(mul(a, b));
			break;
		case '/':
			System.out.println(div(a, b));
			break;
		default:
			System.out.println("Not Applicable");
		}
	}
}
