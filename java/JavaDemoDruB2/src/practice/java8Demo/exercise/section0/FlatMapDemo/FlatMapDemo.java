package practice.java8Demo.exercise.section0.FlatMapDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Complete method below withoutFlatMap(): 
//	Combine nameList into one single list 
//	and print it to the console. 
//	The output should be: 
//		[Mariam, Alex, Ismail, John, Alesha, Andre, Susy, Ali] 

public class FlatMapDemo {
	public static void main(String[] args) {
		FlatMapDemo d = new FlatMapDemo();
		d.m1();
	}
	public void m1() {
		List<List<String>> nameList = new ArrayList<>();
		List<String> abc = Arrays.asList("m","a","ismail");
		List<String> def = Arrays.asList("j","al","sn");
		List<String> ghi = Arrays.asList("su","ali");
		nameList.add(abc);
		nameList.add(def);
		nameList.add(ghi);
		System.out.println(nameList);
		List<String> names = new ArrayList();
		//without flatmap
		for(List<String> listOfNames : nameList) {
			for(String name: listOfNames){
				names.add(name);
			}
		}
		System.out.println(names);
	//with flat map

		
		List<String> nameListWithFMap = nameList.stream()
				.flatMap(List::stream)
				.collect(Collectors.toList());
		
		System.out.println(nameListWithFMap);
	}

}
