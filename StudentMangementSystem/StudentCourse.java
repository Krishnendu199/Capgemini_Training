package StudentMangementSystem;

public class StudentCourse {
	private Student student;
	private Course course;
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public void showStudentCourseDetails() {
		System.out.println("---------STUDENT-----------");
		System.out.println(student.getName());
		System.out.println(student.getAge());
		System.out.println(student.getRollNumber());
		System.out.println(student.getGrade());
		System.out.println("-------------COURSE------------");
		System.out.println(course.getCourseID());
		System.out.println(course.getCourseName());
		
	}
}
