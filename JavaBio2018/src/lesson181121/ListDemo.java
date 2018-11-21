package lesson181121;

import java.util.LinkedList;
import java.util.List;

public class ListDemo {
	
	public static void main(String[] args) {
		
		List<String> list = new LinkedList<>();
		
		list.add("one");
		list.add("two");
		list.add("four");
		list.add("five");
		
		System.out.println(list);
		
		list.add(2, "three");
		System.out.println(list);

		list.add(3, "haha");
		System.out.println(list);
		
		list.remove("haha");
		System.out.println(list);
		
	}

}
