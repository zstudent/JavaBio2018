package lesson181121;

import java.util.Scanner;
import java.util.Stack;

public class StackDemo1 {
	
	public static void main(String[] args) {
		
		System.out.println("--< start >--");

		Stack<String> s = new Stack<String>();
		
		Scanner scanner = new Scanner(System.in);
		
		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			s.push(line);
		}
		
		while (!s.isEmpty()) {
			System.out.println(s.pop());
		}
	}

}
