package lesson181031;

public class InfiniteLoop2 {
	
	public static void main (String params[]) {
		
		int i = 0;
		
		while (true) {
			System.out.println(i);
			if (i > 10) break;
			i = i + 1; // i +=1;   i++;   i := i + 1;  i <- i + 1;
		}
		System.out.println("Finish");
	}

}
