package lesson181120;

public class Max {
	
	static public int max (int[] a) {
		int m = Integer.MIN_VALUE;
		
		for (int x : a) {
			if (x > m) {
				m = x;
			}
		}
		return m;
	}
	
	public static void main(String[] args) {
		
		int max = max(new int[] {10,0,45, 18, -90});
		System.out.println(max);

//		max = max(null);
//		System.out.println(max);
		
		max = max(new int[0]);
		System.out.println(max);
		
	}

}
