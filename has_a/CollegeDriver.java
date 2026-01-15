package has_a;

public class CollegeDriver {
	public static void main(String[] args) {
		College c = new College();
		
		Student s = new Student();
		s.setId(15);
		s.setName("Raju");
		
		Trainer t = new Trainer();
		t.setName("Raghav");
		t.setSubject("Maths");
		t.setStudent(s);
		
		c.setStudent(s);
		c.setTrainer(t);
		c.setName("IEM");
		c.setLocation("Kolkata");
		
		c.display();
	}
}
