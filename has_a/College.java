package has_a;

public class College {
	private String name;
	private String location;
	private Student student;
	private Trainer trainer;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Trainer getTrainer() {
		return trainer;
	}
	public void setTrainer(Trainer trainer) {
		this.trainer = trainer;
	}
	
	public void display() {
		System.out.println("COLLEGE:");
		System.out.println(name);
		System.out.println(location);
		System.out.println("STUDENT:");
		System.out.println(student.getId());
		System.out.println(student.getName());
		System.out.println("TRAINER:");
		System.out.println(trainer.getName());
		System.out.println(trainer.getSubject());
		
	}
}
