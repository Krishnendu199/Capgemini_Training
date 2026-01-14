package objects;

public class StudentMarksCheck {
    private int marks;

    public void setMarks(int marks) {
        if (marks >= 0 && marks <= 100) {
            if (marks >= 40) {
                System.out.println("Student Passed");
                this.marks = marks;
            } else {
                System.out.println("Student Failed");
            }
        } else {
            System.out.println("Invalid Marks");
        }
    }

    public int getMarks() {
        return marks;
    }

    public static void main(String[] args) {
        StudentMarksCheck s = new StudentMarksCheck();
        s.setMarks(25);
    }
}

