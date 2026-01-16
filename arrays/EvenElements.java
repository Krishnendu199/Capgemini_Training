package arrays;

public class EvenElements {
	public static int[] evenElements(int[] a)
	{
		int count=0;
		for(int i = 0; i<a.length;i++) {
			if(a[i]%2==0) {
				count++;
			}
		}
		int[] even = new int[count];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				even[i]=a[i];
			}
		}
		return even;
	}
	public static void main(String[] args) {
		int[] a = {10,20,30,40,50};
		for(int i=0;i<evenElements(a).length;i++) {
			System.out.println(evenElements(a)[i]);
		}		
	}
}
