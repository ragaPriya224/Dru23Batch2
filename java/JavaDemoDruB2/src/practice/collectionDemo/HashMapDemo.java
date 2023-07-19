package practice.collectionDemo;

import java.util.HashMap;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {

		HashMap foodMap = new HashMap();
		foodMap.put("dosa", 150);
		foodMap.put("burger", 100);
		foodMap.put("dosa", 200);
		foodMap.put("icecream", null);
		foodMap.put(null, 50);
//		System.out.println(foodMap.containsKey("pizza"));	
//		System.out.println(foodMap.containsValue(5));	
//		System.out.println(foodMap.get("burger"));
	Set output = foodMap.entrySet();
	System.out.println(output);
//	System.out.println(foodMap.);
	System.out.println(foodMap.getOrDefault("pizza", 0));
System.out.println(foodMap.putIfAbsent("sandwich", 500));
System.out.println(foodMap.keySet());
System.out.println(foodMap.values());
//System.out.println(foodMap.);
System.out.println(foodMap);

	}

}
