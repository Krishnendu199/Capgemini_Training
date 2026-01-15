package StudentMangementSystem;

public class Main {
	public static void main(String[] args) {
		Student s = new Student();
		s.setName("Raju");
		s.setAge(20);
		s.setRollNumber(17);
		s.setGrade('A');
		Course c = new Course();
		c.setCourseID(123);
		c.setCourseName("Java");
		StudentCourse sc = new StudentCourse();
		sc.setStudent(s);
		sc.setCourse(c);
		sc.showStudentCourseDetails();
	}
}
