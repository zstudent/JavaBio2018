package lesson181120;

public class SearchInt {
	
	static int search(int[] a, int key) {
		// TODO

		for (int i = 0; i < a.length; i++) {
			if (a[i] == key) {
				return i;
			}
		}
		
		return -1;
	}
	
	static boolean contains(int[] a, int key) {
		return search(a, key) >=0;
	}

	static int reverseSearch1(int[] a, int key) {
		// TODO

		for (int i = 0; i < a.length; i++) {
			if (a[a.length - 1 - i] == key) {
				return i;
			}
		}
		
		return -1;
	}
	

	static int reverseSearch2(int[] a, int key) {
		// TODO
		
		for (int i = a.length - 1; i >= 0; i--) {
			if (a[i] == key) {
				return i;
			}
		}
		
		return -1;
	}
	
	
	
}
