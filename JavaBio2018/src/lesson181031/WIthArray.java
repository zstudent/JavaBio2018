package lesson181031;

public class WIthArray {
	
	public static void main(String[] args) {
		
		int a[] = new int[100];
		
		a[0] = 0;
		a[1] = 1;
		a[2] = 2;
		
		for (int i = 0; i < a.length; i++) {
			a[i] = i;
		}
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		for (int x : a) {
			System.out.println(x);
		}
		
		for (int i = 0; i < a.length; i++) {
			int x = a[i];
			System.out.println(x);
		}
		
	}

}
