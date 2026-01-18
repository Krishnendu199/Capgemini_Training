package Assignment_1DArray;

public class Question14 {
	public static void main(String[] args) {
		int[]a = {10,20,30,30,40,50,50,50};
		for(int i=0;i<a.length;i++){
			 int count=0;
			 for(int j=0;j<a.length;j++)
			  if(a[i]==a[j]) count++;
			 if(count==1) System.out.print(a[i]+" ");
			}
	}
}
