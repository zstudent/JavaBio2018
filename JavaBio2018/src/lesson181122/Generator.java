package lesson181122;

import java.util.Random;

class Generator {
	
	static char[] nucleotides = {'A', 'C', 'G', 'T'};
	
	Random r = new Random();
	
	public String generate() {
		
		int len = 100000 + r.nextInt(50000);
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < len; i++) {
			int nucIndex = r.nextInt(nucleotides.length);
			sb.append(nucleotides[nucIndex]);
		}
		
		return sb.toString();
		
	}
	
	
	
}