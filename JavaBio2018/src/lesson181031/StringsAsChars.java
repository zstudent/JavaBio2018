package lesson181031;

public class StringsAsChars {

	public static void main(String[] args) {
		
		String s = "Hello, world";
		
//		System.out.println(s.length());
		
		byte[] bytes = s.getBytes();
		
		for (byte b : bytes) {
			System.out.println(b);
		}
		
		for (int i = 0; i < bytes.length; i++) {
			char c = (char) bytes[i];
			System.out.println(c);
		}
		
		s = "Привет";
		
		for (char c : s.toCharArray()) {
			System.out.println(c);
		}
		
		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
		}
		
	}
	
}
