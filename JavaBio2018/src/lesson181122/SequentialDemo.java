package lesson181122;

public class SequentialDemo {
	
	public static void main(String[] args) {
		
		System.out.println("start");
		
		Generator gen = new Generator();
		Processor proc = new Processor();
		
		long start = System.currentTimeMillis();
		
		for (int i = 0; i < 1_000; i++) {
			String read = gen.generate();
			String reversed = proc.process(read);
//			System.out.println(read + " --> " + reversed);
		}

		long stop = System.currentTimeMillis();

		System.out.println("Elapsed = " + (stop - start));
		
	}

}
