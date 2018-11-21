package lesson181120;

import java.util.Arrays;

public class SelectionSort {
	
	public static void sort(int[] a) {
		for (int i = 0; i < a.length; i++) {
			int min = findMin(a, i);
			exch(a, i, min);
		}
	}
	
	static int findMin(int[] a, int start) {
		int m = start;
		for (int i = start; i < a.length; i++) {
			if (a[i] < a[m]) {
				m = i;
			}
		}
		return m;
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
