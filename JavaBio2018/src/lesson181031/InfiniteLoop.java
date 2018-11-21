package lesson181031;

public class InfiniteLoop {
	
	public static void main(String[] parameters) {
		
		/*  sdfsdfsdf
		 *  sdfsdf
		 *  sdfsdf
		 *  sdfsdf
		 */
		
		int i = 0;  // int ->>  i, j, k, l, m, n   FORTRAN
		while (i < 10) {
			if (i % 10_000_000 == 0)
					System.out.println(i);
			i = i - 1;
		}
		
		System.out.println("Final value = " + i);
	}

}
