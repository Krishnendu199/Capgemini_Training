package Assignment_1DArray;

public class Question30 {
	    public static void main(String[] args) {

	        int[] a = {10, 20, 30, 40, 50};
	        int n = a.length;
	        int target = 50;
	        int found = 0;

	        for(int i = 0; i < n; i++) {
	            for(int j = i + 1; j < n; j++) {
	                if(a[i] + a[j] == target) {
	                    System.out.println(a[i] + " " + a[j]);
	                    found = 1;
	                }
	            }
	        }

	        if(found == 0)
	            System.out.println("No pair found");
	    }
	}

