package practice.collectionDemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Stack;

public class IteratorDemo {
	public static void main(String[] args) {
		
		List<Integer> markList = new ArrayList<Integer>();
		markList.add(3);
		markList.add(5);
		markList.add(6);
		markList.add(7);

		Iterator<Integer> iterator = markList.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		HashMap<String,Integer> foodMap = new HashMap<String,Integer>();
		foodMap.put("dosa", 150);
		foodMap.put("burger", 100);

		Iterator<Entry<String, Integer>> output = foodMap.entrySet().iterator();
		while(output.hasNext()) {
			System.out.println(output.next());
		}
		
		Stack s = new Stack();
		s.push("A");
		s.push("B");
		s.push("c");
		System.out.println(s);
		System.out.println(s.search("B"));

		
		
//		Iterator<Integer> iterator2 = markList.iterator();
//		while(iterator2.hasNext()) {
//			System.out.println(iterator2.next());
//		}
	}
}
