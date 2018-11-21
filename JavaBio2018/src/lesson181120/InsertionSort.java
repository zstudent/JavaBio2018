package lesson181120;

import java.util.Arrays;

public class InsertionSort {
	
	public static void sort(int[] a) {
		for (int i = 1; i < a.length; i++) {
			for (int j = i; j > 0; j--) {
				if (a[j-1] > a[j]) {
					exch(a, j-1, j);
				} else {
					break;
				}
			}
		}
	}
	
	static void exch(int[] a, int i, int j) {
		int t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
	
	public static void main(String[] args) {
		
		int[] a = {10, 20, 4, -3, 5, 8};
		sort(a);
		System.out.println(Arrays.toString(a));
		
	}

}
