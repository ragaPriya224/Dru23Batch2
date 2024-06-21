package practice.collectionDemo;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> foodList = new ArrayList<String>();
		foodList.add("dosa");
		foodList.add("pizza");
		foodList.add("samosa");
		foodList.add(1234);
		foodList.add(false);
		foodList.add("dosa");
		foodList.add(null);
		System.out.println(foodList);

	}

}
