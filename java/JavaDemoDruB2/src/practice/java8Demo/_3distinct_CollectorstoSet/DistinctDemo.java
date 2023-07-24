package practice.java8Demo._3distinct_CollectorstoSet;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DistinctDemo d = new DistinctDemo();
		d.getDistinctData();
	}
	
	public void getDistinctData()   {
		 List<Integer> numbersList = Arrays.asList(1,1,1,2,3,4,4,4,4,5,5,5,5,5);
		 List<Integer> distinctList = numbersList.stream()
		 .distinct()
		 .collect(Collectors.toList());
		 System.out.println(distinctList);
	}

}
