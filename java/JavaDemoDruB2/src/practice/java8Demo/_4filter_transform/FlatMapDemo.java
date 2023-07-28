package practice.java8Demo._4filter_transform;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FlatMapDemo d = new FlatMapDemo();
		d.m1();
	}
	public void m1() {
		List<List<String>> nameList = new ArrayList<>();
		List<String> abc = Arrays.asList("a","z","b");
		List<String> def = Arrays.asList("y","ch","cd");
		List<String> ghi = Arrays.asList("zl","ab","qwe");
		nameList.add(abc);
		nameList.add(def);
		nameList.add(ghi);
		System.out.println(nameList);

		//without flatmap
		List<String> namesDataList = new ArrayList<>();
		for(List<String> listOfNames:nameList) {
			for(String name:listOfNames) {
				namesDataList.add(name);
			}
		}
		System.out.println(namesDataList);
		
		
		// with flatmap 
		List<String> outputList = nameList.stream()
		.flatMap(List::stream)
//		.flatMap(d -> d.stream())
		.collect(Collectors.toList());
		System.out.println(outputList);
		
	}

}
