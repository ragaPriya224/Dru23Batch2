package practice.collectionDemo;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet foodSet = new HashSet();
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
