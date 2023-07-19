package practice.collectionDemo;

import java.util.TreeSet;

public class SortedSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet markSet = new TreeSet();
		markSet.add(100);
		markSet.add(115);
		markSet.add(101);
		markSet.add(103);
		markSet.add(104);
		markSet.add(110);
		markSet.add(115);
		System.out.println(markSet);
		System.out.println(markSet.first());//100
		System.out.println(markSet.last());//15
		System.out.println(markSet.headSet(104));//100,101,103
		System.out.println(markSet.tailSet(104));
		System.out.println(markSet.subSet(103,110));

	}

}
