package core_java;

public class Operators {
	public static void main(String[] args) {
		// ARITHMETIC OPERATORS 
        int a = 10;
        int b = 5;
        

        System.out.println(a + b);                     
        System.out.println("A = " + a);             
        System.out.println(a + b + " total");       
        System.out.println("hello" + a);     

        // ASSIGNMENT OPERATORS
        int x = 10;     
        x += 5;         
        System.out.println(x);

        int y = 30;     
        y -= 5;         
        System.out.println(y);

        // RELATIONAL OPERATORS
        int p = 8, q = 5;
        System.out.println(p > q);    
        System.out.println(p == q);   

        // LOGICAL OPERATORS
        boolean m = true;
        boolean n = false;
        System.out.println(m && n);   
        System.out.println(m || n);   
    }
}

