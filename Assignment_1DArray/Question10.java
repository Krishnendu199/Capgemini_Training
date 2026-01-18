package Assignment_1DArray;

public class Question10 {
	public static void main(String[] args) {
		int[]a = {10,20,30,40,50};
		int max=Integer.MIN_VALUE, smax=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++){
		    if(a[i]>max){ smax=max; max=a[i]; }
		    else if(a[i]>smax && a[i]!=max) smax=a[i];
		}
		System.out.println(smax);

	}
}
