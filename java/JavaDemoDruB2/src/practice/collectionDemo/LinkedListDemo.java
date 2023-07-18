package practice.collectionDemo;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList foodList = new LinkedList();
		foodList.add("dosa");
		foodList.add("pizza");
		foodList.add("samosa");
		foodList.add(1234);
		foodList.add(false);
		foodList.add("dosa");
		foodList.add(null);
		System.out.println(foodList);
		foodList.addFirst("briyani");
		foodList.addLast("juice");
		//getFirst,getLast
		//removefirst, removelast
		System.out.println(foodList);
	}

}
