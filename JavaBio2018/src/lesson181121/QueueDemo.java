package lesson181121;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueDemo {
	
	public static void main(String[] args) {

		Queue<String> q = new ArrayDeque<String>();
		
		q.add("Hello");
		q.add("World");
		
		System.out.println(q);
		
		q.add("!");
		System.out.println(q);
		
		String w = q.remove();
		
		System.out.println(q);
		System.out.println(w);
	}

}
