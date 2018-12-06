package lesson181206;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeSet;

public class TreeSortDemo {
	
	public static void main(String[] args) {
		
		int[] a = {10, 12, 3, 5, -1, 100, 14};
		
		sort(a);
		
		System.out.println(Arrays.toString(a));
		
	}

	private static void sort(int[] a) {
		Set<Integer> set = new TreeSet<>();
		
		for (Integer x : a) {
			set.add(x);
		}
		
		int i = 0;
		for (Integer x : set) {
			a[i++] = x;
		}
	}

}
