package arrays;

public class ElementIndex {
	public static int[] addElementInIndex(int[] arr,int e, int index) {
	     int[] newArr = new int[arr.length + 1];
	        for (int i = 0; i < index; i++) {
	            newArr[i] = arr[i];
	        }
	        newArr[index] = e;
	        for (int i = index; i < arr.length; i++) {
	            newArr[i + 1] = arr[i];
	        }
	        return newArr;
	}
	public static int[] replaceElementInIndex(int[] arr,int e, int index) {
		arr[index] = e;
		return arr;
	}
	public static int[] removeElementInIndex(int[] arr,int index)
	{
		int[] newArr = new int[arr.length - 1];
        for (int i = 0; i < index; i++) {
            newArr[i] = arr[i];
        }
        for (int i = index+1; i < arr.length; i++) {
            newArr[i - 1] = arr[i];
        }
        return newArr;
	}
	
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		int[] f = removeElementInIndex(a, 1);
		//int[] f = replaceElementInIndex(a, 10, 1);
		for(int i =0;i<f.length;i++)
		{
			System.out.println(f[i]);
		}
	}
}
