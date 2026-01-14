package objects;

public class Voter {
    private int age;
    
    public void setAge(int age) {
        if (age > 0 && age <= 100)
        		if(age>=18) {
        			System.out.println("Eligible to Vote");
        			this.age = age;
        		}
        		else
        			System.out.println("Not eligible to Vote");
    }
    public int getAge() {
    		return age;
    }

    public static void main(String[] args) {
        Voter v = new Voter();
        v.setAge(20);     
 
    }
}

