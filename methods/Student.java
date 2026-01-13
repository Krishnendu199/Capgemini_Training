package methods;

public class Student {
    int rollNo;
    String name;
    int marks;

    public void study() {
        System.out.println(name + " is studying");
    }

    public void printStudent() {
        System.out.println(rollNo);
        System.out.println(name);
        System.out.println(marks);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        s2.rollNo = 1;
        s2.name = "Amit";
        s2.marks = 85;

        s2.study();
        s2.printStudent();

        s1.study();
        s1.printStudent();
    }
}

