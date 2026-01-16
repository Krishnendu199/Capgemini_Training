package arrays;

import java.util.Scanner;

public class Array2D {
	
	public static int[] RowWiseSum(int[][] arr) {
	    int[] result = new int[arr.length];

	    for (int i = 0; i < arr.length; i++) {
	        int sum = 0;
	        for (int j = 0; j < arr[i].length; j++) {
	            sum += arr[i][j];
	        }
	        result[i] = sum;
	    }
	    return result;
	}
	
	public static int[] ColumnWiseSum(int[][] arr) {
	    int cols = arr[0].length;
	    int[] result = new int[cols];

	    for (int j = 0; j < cols; j++) {
	        int sum = 0;
	        for (int i = 0; i < arr.length; i++) {
	            sum += arr[i][j];
	        }
	        result[j] = sum;
	    }
	    return result;
	}

	    
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter elements:");
		int[][] a = new int[2][3];
		
//		for(int i = 0; i<a.length;i++) {
//			for(int j=0;j<a[i].length;j++) {
//				a[i][j]=sc.nextInt();
//			}
//		}
		int f[] = RowWiseSum(a);
		
		for(int i = 0; i<a.length;i++) {
			System.out.println(f[i]);
		}
//		for(int i=0;i<a.length;i++) {
//			for(int j=0;j<a[i].length;j++) {
//				System.out.println(a[i][j]);
//			}
//		}
	}
}
