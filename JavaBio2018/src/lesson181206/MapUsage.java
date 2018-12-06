package lesson181206;

import java.util.Map;
import java.util.TreeMap;

public class MapUsage {
	
	public static void main(String[] args) {
		
//		Map<String, String> table = new HashMap<String, String>();
//		Map<String, String> table = new LinkedHashMap<String, String>();
		Map<String, String> table = new TreeMap<String, String>();
		
		System.out.println(table.put("Ann", "Boston"));
		table.put("Bob", "Moscow");
		table.put("Mike", "Toronto");
		table.put("John", "Paris");
		table.put("Pete", "Boston");
		
		System.out.println(table);
		System.out.println(table.size());
		
		System.out.println(table.put("Pete", "New York"));

		System.out.println(table);
		System.out.println(table.size());
		
		for (String key: table.keySet()) {
			System.out.println(key);
		}
	}

}
