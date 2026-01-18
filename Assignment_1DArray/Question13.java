package Assignment_1DArray;

public class Question13 {
	public static void main(String[] args) {
		int[]a = {10,20,30,30,40,50,50,50};
		for(int i=0;i<a.length;i++){
			 boolean dup=false;
			 for(int j=0;j<i;j++)
			  if(a[i]==a[j]) dup=true;
			 if(!dup) System.out.print(a[i]+" ");
			}
	}
}
