package practice.collectionDemo;

import java.util.HashMap;
import java.util.TreeSet;

public class GenericDemo {

	public static void main(String[] args) {
		int []mark = new int [5];

		mark[2] = 40;
//		mark[4] = "hii";
		mark[1] = 60;
		
		TreeSet<Integer> markSet = new TreeSet<Integer> ();
		markSet.add(133);
		markSet.add("hii");
		markSet.add(130);
		
		HashMap<String,Integer> foodMap = new HashMap<String,Integer>();
		foodMap.put("dosa", 150);
		foodMap.put("burger", 100);

	}

}
