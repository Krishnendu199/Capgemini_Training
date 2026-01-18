package Assignment_1DArray;

import java.util.Arrays;

public class Question25 {
	   public static void main(String[] args) {

	        int[] a = {40, 10, 30, 20, 50};
	        int n = a.length;
	        int key = 30;

	        for(int i = 0; i < n; i++) {
	            for(int j = i + 1; j < n; j++) {
	                if(a[i] > a[j]) {
	                    int temp = a[i];
	                    a[i] = a[j];
	                    a[j] = temp;
	                }
	            }
	        }
	        int low = 0;
	        int high = n - 1;
	        int flag = 0;

	        while(low <= high) {
	            int mid = (low + high) / 2;

	            if(a[mid] == key) {
	                System.out.println("Element found at index " + mid);
	                flag = 1;
	                break;
	            }
	            else if(a[mid] < key)
	                low = mid + 1;
	            else
	                high = mid - 1;
	        }

	        if(flag == 0)
	            System.out.println("Element not found");
	    }	
}
