package lesson181031;

public class PQfor {
	
	public static void main(String[] args) {
		
		int f = 0, g = 1;
		
		// Fibonacci :  In =  In-1 + In-2
		
		for (int i = 0; i <= 10; i++) {
			System.out.println(f);
			f = f + g;
			g = f - g;
//			f = f - g;
		}
		
	}
	
}