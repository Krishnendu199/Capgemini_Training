package Assignment_1DArray;

public class Question28 {
	public static void main(String[] args) {

        int[] a = {10, 20, 41, 37, 51,60};
        int[] b={1,2};
        int[] c=new int[a.length+b.length];
        int k=0;
        for(int x:a) c[k++]=x;
        for(int x:b) c[k++]=x;

        for(int i=0;i<c.length;i++)
        {
        		System.out.print(c[i]+" ");
        }
    }
}
