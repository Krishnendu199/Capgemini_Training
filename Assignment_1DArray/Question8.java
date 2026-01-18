package Assignment_1DArray;

public class Question8 {
	public static void main(String[] args) {
		int[]a = {10,20,30,40,50};
		int[] r=new int[a.length];
		for(int i=0;i<a.length;i++)
		    r[i]=a[r.length-1-i];
		for(int i=0;i<a.length;i++)
		    System.out.println(r[i]);
	}
}
