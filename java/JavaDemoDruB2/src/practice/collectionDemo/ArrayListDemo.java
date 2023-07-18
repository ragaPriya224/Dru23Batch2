package practice.collectionDemo;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList foodList = new ArrayList();
		foodList.add("dosa");
		foodList.add("pizza");
		foodList.add("samosa");
		foodList.add(1234);
		foodList.add(false);
		foodList.add("dosa");
		foodList.add(null);
		System.out.println(foodList);
		foodList.remove("samosa");
		System.out.println(foodList);
		foodList.size();//6
		foodList.add(1,"puthraikalu");
		System.out.println(foodList);
		foodList.remove(2);
		System.out.println(foodList);
		foodList.set(4, "mushroom dosa");
		System.out.println(foodList);
		foodList.contains("burger");//false
		foodList.get(0);//dosa
		ArrayList drinkList = new ArrayList();
		drinkList.add("coffee");
		drinkList.add("tea");
		drinkList.add("milo");
		
		foodList.addAll(3,drinkList);
				System.out.println(foodList);
				
	}

}
