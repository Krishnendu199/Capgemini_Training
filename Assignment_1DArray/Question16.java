package Assignment_1DArray;

public class Question16 {
	public static void main(String[] args) {
		int[]a = {10,20,30,40,50};
		int f1=0,f2=1;
		for(int i=0;i<a.length;i++){
		 System.out.print(f1+" ");
		 int f3=f1+f2;
		 f1=f2; f2=f3;
		}
	}
}
