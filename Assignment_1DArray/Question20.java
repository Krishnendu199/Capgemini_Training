package Assignment_1DArray;

public class Question20 {
	public static void main(String[] args) {
		int[]a = {10,20,31,43,50};
		int first=a[0];
		for(int i=0;i<a.length-1;i++)
		 a[i]=a[i+1];
		a[a.length-1]=first;
		for(int i=0;i<a.length;i++)
			System.out.print(a[i] +" ");
	}
}
