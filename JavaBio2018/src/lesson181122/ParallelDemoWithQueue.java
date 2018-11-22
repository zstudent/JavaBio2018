package lesson181122;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

public class ParallelDemoWithQueue {

	public static void main(String[] args) {

		System.out.println("start");

		Generator gen = new Generator();
		Processor proc = new Processor();

		BlockingQueue<String> queue = new LinkedBlockingQueue<String>(100);

		Executor executor = Executors.newCachedThreadPool();

		long start = System.currentTimeMillis();

		executor.execute(() -> {
			try {
				for (int i = 0; i < 10_000; i++) {
					if (i % 1000 == 0) {
						System.out.println(queue.size());
					}
					String read = gen.generate();
					queue.put(read);
				}
				queue.put("");
			} catch (Exception e) {
				e.printStackTrace();
			}
		});

		executor.execute(() -> {
			String read;
			long waiting = 0;
			while (true) {
				try {
					long before = System.currentTimeMillis();
					read = queue.take();
					waiting += System.currentTimeMillis() - before;

					if (read.length() == 0) {
						break;
					}
					String reversed = proc.process(read);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			long stop = System.currentTimeMillis();
			System.out.println("Elapsed = " + (stop - start));
			System.out.println("Waiting = " + waiting);
		});

	}

}
