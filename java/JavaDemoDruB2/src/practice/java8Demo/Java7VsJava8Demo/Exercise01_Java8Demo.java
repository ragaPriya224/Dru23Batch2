package practice.java8Demo.Java7VsJava8Demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//1. print number 0 to 50 by java7.
//2. List<String> names = Arrays.asList("Sam", "Peter","ballon","Sam");
// print unique data present in this list by java7
public class Exercise01_Java8Demo {

	public static void main(String[] args) {

		Exercise01_Java8Demo e = new Exercise01_Java8Demo();
		e.printNumber();
		e.printUniqueData();
	}

	public void printNumber() {
		int total1 = IntStream.rangeClosed(0,50).sum();
		System.out.println(total1);
	}
	
	public void printUniqueData() {
		List<String> names = Arrays.asList("Sam", "Peter","ballon","Sam");
		List<String> uniqueList = names.stream().distinct().collect(Collectors.toList());
		System.out.println(uniqueList);
	}

}
