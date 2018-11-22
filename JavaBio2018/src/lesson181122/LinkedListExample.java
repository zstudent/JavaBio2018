package lesson181122;

import java.util.Scanner;

public class LinkedListExample {
	
	public static void main(String[] args) {

		System.out.println("Enter data:");
		
		Scanner scanner = new Scanner(System.in);
		
		Node list = null;
		while (scanner.hasNextLine())
		{
		   Node old = list;
		   list = new Node();
		   list.item = scanner.nextLine();
		   list.next = old;
		}
		for (Node t = list; t != null; t = t.next)
		   System.out.println(t.item);
		
	}

}


class Node {
	String item;
	Node next;
}