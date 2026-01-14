package methods;

public class LeapYear {
	public static String checkLeapYear(int y) {
		if (y % 400 == 0 || (y % 4 == 0 && y % 100 != 0)) {
			return "Leap Year";
		} else
			return "Not Leap Year";
	}

	public static void main(String[] args) {
		System.out.println(checkLeapYear(2020));
	}

}
