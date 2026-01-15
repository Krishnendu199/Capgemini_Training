package has_a;

public class Trainer {
	private String name;
	private String subject;
	private Student student;
	public void setSubject(String subject)
	{
		this.subject=subject;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getSubject() {
		return subject;
	}
	public String getName() {
		return name;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
}
