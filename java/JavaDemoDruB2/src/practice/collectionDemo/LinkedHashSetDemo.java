package practice.collectionDemo;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet foodSet = new LinkedHashSet();
		foodSet.add("dosa");
		foodSet.add("pizza");
		foodSet.add("samosa");
		foodSet.add(1234);
		foodSet.add(false);
		foodSet.add("dosa");
		foodSet.add(null);
		System.out.println(foodSet);
				
	}

}
