package methods;

import java.util.Scanner;

public class Scanner_info {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter weight:" );
	    double weight = sc.nextDouble();
		
		System.out.println("Enter name:" );
		String name = sc.nextLine();
		sc.nextLine();
        
        System.out.println("Enter age:" );
        int age = sc.nextInt();
        
        System.out.println("Enter Phone:");
        long phone = sc.nextLong();     
        
        System.out.println("Enter Email:");
        String email = sc.nextLine();
        sc.nextLine();
        
        System.out.println("Enter gender:" );
        char gender = sc.next().charAt(0);
        
        System.out.println("Weight: " + weight);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone:" +phone);
        System.out.println("Email:" +email);
        System.out.println("Gender: " + gender);
        
	}

}
