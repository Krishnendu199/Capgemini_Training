package Assignment_1DArray;

public class Question11 {
	public static void main(String[] args) {
		int[]a = {10,20,30,30,40,50,50,50};
		for(int i=0;i<a.length;i++){
		    int count=1;
		    for(int j=i+1;j<a.length;j++)
		        if(a[i]==a[j]){ count++; a[j]=-1; }
		    if(a[i]!=-1)
		        System.out.println(a[i]+" -> "+count);
		}

	}
}
