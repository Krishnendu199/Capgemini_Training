package has_a;

public class Student2 {
    private Brain brain;        
    private Laptop laptop;      

    public Student2() {
        brain = new Brain();    // Composition
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;   // Aggregation
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public static void main(String[] args) {
        Student2 student = new Student2();

        student.brain.think();               
        student.setLaptop(new Laptop());     
        student.getLaptop().work();
    }
}

class Brain {
    public void think() {
        System.out.println("Student is thinking");
    }
}

class Laptop {
    public void work() {
        System.out.println("Laptop is working");
    }
}
