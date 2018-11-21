package lesson181121;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class QueueDemo2 {
	
	public static void main(String[] args) {
		
		System.out.println("--< start >--");

		Queue<String> q = new ArrayDeque<String>();
		
		Scanner scanner = new Scanner(System.in);
		
		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			q.add(line);
		}
		
		while (!q.isEmpty()) {
			System.out.println(q.remove());
		}
	}

}
