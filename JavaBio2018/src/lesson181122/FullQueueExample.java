package lesson181122;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class FullQueueExample {

	public static void main(String[] args) throws InterruptedException {

		BlockingQueue<String> queue = new LinkedBlockingQueue<String>(3);

		queue.add("one");
		queue.add("two");
		queue.add("three");

		System.out.println(queue);
		System.out.println(queue.size());

		boolean success = queue.offer("four");
		if (success) {
			System.out.println(queue);
			System.out.println(queue.size());
		} else {
			System.out.println("can't add element: queue is full!");
		}

	}

}
