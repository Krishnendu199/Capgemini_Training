package arrays;

public class ReverseArray {
	public static void reverseArray(int[] arr)
	{
		int left=0;
		int right=arr.length;
		for(int i=left;i<=right;i++)
		{
			int temp = arr[right];
			arr[right] = arr[left];
			arr[left] = temp;
		}
		for(int i=left;i<right;i++)
			System.out.println(arr[i]);
	}
	public static void main(String[] args) {
		int[] a = {10,20,30,40};
		reverseArray(a);
	}
}
