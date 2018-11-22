package lesson181122;

public class Processor {
	
	public String process(String read) {
		char[] chars = read.toCharArray();
		char[] reversed = new char[chars.length];
		for (int j = 0; j < 100; j++) {
			for (int i = 0; i < chars.length; i++) {
				reversed[chars.length - 1 - i] = chars[i];
			}
		}
		return new String(reversed);
	}
}
