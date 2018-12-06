package lesson181206;

import java.util.Arrays;
import java.util.PriorityQueue;

public class HeapSortDemo {
	
	public static void main(String[] args) {
		
		int[] a = {10, 12, 3, 5, -1, 100, 14};
		
		sort(a);
		
		System.out.println(Arrays.toString(a));
		
	}

	private static void sort(int[] a) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		for (Integer x : a) {
			pq.add(x);
		}
		
		int i = 0;
		while(!pq.isEmpty()) {
			a[i++] = pq.remove();
		}
		
	}

}
