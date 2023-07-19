package practice.collectionDemo;

import java.util.TreeSet;

public class TreeSetDescDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet markSet = new TreeSet(new MyComparator());
		markSet.add(133);
		markSet.add(115);
		markSet.add(130);
		System.out.println(markSet);

	}

}
