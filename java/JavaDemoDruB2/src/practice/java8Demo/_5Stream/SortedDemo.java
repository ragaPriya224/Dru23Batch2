package practice.java8Demo._5Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortedDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortedDemo s = new SortedDemo();
//		s.m1();
		s.skipDemo();
	}
	public void m1() {
		List<String> cityList = Arrays
				.asList("Gurgaon" , "NewDelhi" , "Mumbai","tokyo","berlin","bombay");
		cityList.stream()
		.sorted().forEach(System.out::println);
	}
	public void skipDemo() {
		List<String> cityList = Arrays
				.asList("Gurgaon" , "NewDelhi" , "Mumbai","tokyo","berlin","bombay");
		List<String> skippedList = cityList.stream()
//				.filter(name -> name.startsWith("b"))
				.skip(4).collect(Collectors.toList());
		System.out.println(skippedList);

		cityList.stream()
		.filter(s ->s.length()>5)
		.skip(2)
		.forEach(x-> System.out.println(x));

	}

}
