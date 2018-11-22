package lesson181122;

import java.util.LinkedList;
import java.util.Queue;

public class EmptyQueueExample {
	
	public static void main(String[] args) {
		
		Queue<String> queue = new LinkedList<String>();
		
		String removedElement = queue.poll();
		
		System.out.println(removedElement);

//		String removedElement2 = queue.remove();
//		
//		System.out.println(removedElement2);
		
	}

}
