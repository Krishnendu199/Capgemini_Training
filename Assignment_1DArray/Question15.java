package Assignment_1DArray;

public class Question15 {
	public static void main(String[] args) {
		int[]a = {10,20,31,43,50};
		for(int x:a){
			 int c=0;
			 for(int i=1;i<=x;i++)
			  if(x%i==0) c++;
			 if(c==2) System.out.print(x+" ");
			}
	}
}
