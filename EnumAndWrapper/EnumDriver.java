package EnumAndWrapper;

public class EnumDriver {
	enum Day{Mon,Tues,Wed,Thurs,Fri,Sat,Sun};
	public static void main(String[] args) {
		System.out.println(Day.Mon);
		Day d = Day.Thurs;
		System.out.println(d);
	}
}
