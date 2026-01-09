package conditional_statement;

public class Schedule {
	public static void main(String[] args) {
		String day = "tue";
		switch(day)
		{
		case "mon":
		case "wed":
		case "thurs":
			System.out.println("English");
		break;
		case "fri":
			System.out.println("SQL");
		break;
		case "tue":
		case "sat":
			System.out.println("Java");
		break;
		default:
			System.out.println("holiday");
		}
	
	}

}
