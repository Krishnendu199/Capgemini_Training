package Exceptions;

public class Checked {
public static void main(String[] args) {
	System.out.println("hi");
	try {
		Class.forName("arrays.Student");
	} catch (ClassNotFoundException e) {
		System.out.println("Class info is wrong");
	}
	try {
		Thread.sleep(3000); //checked exception
	}
	catch (InterruptedException e) {
		System.out.println("sleep method called!!");
		e.printStackTrace();
	}
	System.out.println("bye");
}
}
