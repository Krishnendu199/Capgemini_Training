package inheritance;

public class Student extends Human {
	double percent;
	
	public Student(String name, int age, char gender, double percent)
	{
		super(name,age,gender);
		this.percent=percent;
	}
	public void printStudent()
	{
		System.out.println(name);
		System.out.println(age);
		System.out.println(gender);
		System.out.println(percent);
	}
	public static void main(String[] args) {
		Student s = new Student("Raghav", 14, 'M', 67.8);
		s.printStudent();
	}
}
