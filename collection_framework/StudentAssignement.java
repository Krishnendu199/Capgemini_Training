package collection_framework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class StudentClass {
	int id;
	String name;
	int marks;

	StudentClass(int id, String name, int marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
}

public class StudentAssignement {

	public static void main(String[] args) {

		List<StudentClass> students = new ArrayList<>();

		addStudents(students);
		displayStudents(students);
		displayPassedStudents(students);
		findTopper(students);
		searchStudent(students);
		countPassFail(students);
	}

	public static void addStudents(List<StudentClass> students) {
		students.add(new StudentClass(1, "Rahul", 78));
		students.add(new StudentClass(2, "Amit", 35));
		students.add(new StudentClass(3, "Sneha", 90));
		students.add(new StudentClass(4, "Priya", 42));
		students.add(new StudentClass(5, "Rohit", 28));
	}

	public static void displayStudents(List<StudentClass> students) {
		System.out.println("All Students:");
		for (StudentClass s : students) {
			System.out.println(s.id + " " + s.name + " " + s.marks);
		}
	}

	public static void displayPassedStudents(List<StudentClass> students) {
		System.out.println("\nPassed Students:");
		for (StudentClass s : students) {
			if (s.marks >= 40) {
				System.out.println(s.name + " - " + s.marks);
			}
		}
	}

	public static void findTopper(List<StudentClass> students) {
		StudentClass topper = students.get(0);

		for (StudentClass s : students) {
			if (s.marks > topper.marks) {
				topper = s;
			}
		}

		System.out.println("\nTopper:");
		System.out.println(topper.name + " - " + topper.marks);
	}

	public static void searchStudent(List<StudentClass> students) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter student name to search: ");
		String name = sc.nextLine();

		boolean found = false;
		for (StudentClass s : students) {
			if (s.name.equalsIgnoreCase(name)) {
				System.out.println("Student Found: " + s.name + " - " + s.marks);
				found = true;
				break;
			}
			else
				System.out.println("Student Not Found");
		}
	}

	public static void countPassFail(List<StudentClass> students) {
		int pass = 0;
		int fail = 0;

		for (StudentClass s : students) {
			if (s.marks >= 40) {
				pass++;
			} else {
				fail++;
			}
		}

		System.out.println("\nPassed Count: " + pass);
		System.out.println("Failed Count: " + fail);
	}
}
