package practice.java8Demo._3distinct_CollectorstoSet;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectorsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CollectorsDemo d = new CollectorsDemo();
		d.getDistinctData();
	}
	
	public void getDistinctData()   {
		 List<Integer> numbersList = Arrays.asList(1,1,1,2,3,4,4,4,4,5,5,5,5,5);
		  Set<Integer> distinctSet = numbersList.stream()
		 .collect(Collectors.toSet());
		 System.out.println(distinctSet);
	}

}
