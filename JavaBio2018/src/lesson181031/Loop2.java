package lesson181031;

public class Loop2 {
	
	public static void main (String[] a) {
		int i = 0;
		for (;;) {   // while (true)
			if (i >= 10) break;
			System.out.println(i);
			i++;
		}
		
	}

}
