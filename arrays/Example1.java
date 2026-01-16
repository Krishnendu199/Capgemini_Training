package arrays;

import java.util.Scanner;

public class Example1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[3];
		System.out.println(a.length);
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
//		System.out.println(a[0]);
//		System.out.println(a[1]);
//		System.out.println(a[2]);
		
		char[] c = new char[3];
		boolean[] b = new boolean[3];
		float[] f = new float[4];
		for(int i =0;i<c.length;i++) {
			sc.next().charAt(c[i]);
		}
//		for(int i =0;i<a.length;i++) {
//			System.out.println(a[i]);
//		}
		
		for(int i =0;i<c.length;i++) {
			System.out.println(c[i]);
		}
		
	}
}
