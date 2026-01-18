package Assignment_1DArray;

public class Question23 {
	public static void main(String[] args) {

        int[] a = {10, 41, 41, 37,37, 51,60};
        int n = a.length;
        for(int i=0;i<n;i++)
        	 for(int j=i+1;j<n;j++)
        	  if(a[i]==a[j]) 
        		  System.out.print(a[i]+" ");
    }
}
