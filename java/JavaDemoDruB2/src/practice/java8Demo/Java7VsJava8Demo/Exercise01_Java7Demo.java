package practice.java8Demo.Java7VsJava8Demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//1. print number 0 to 50 by java7.
//2. List<String> names = Arrays.asList("Sam", "Peter","ballon","Sam");
// print unique data present in this list by java7
public class Exercise01_Java7Demo {

	public static void main(String[] args) {

		Exercise01_Java7Demo e = new Exercise01_Java7Demo();
		e.printNumber();
		e.printUniqueData();
	}

	public void printNumber() {
		int total = 0;
		for(int i = 0; i<=50;i++){
			total +=i;
		}
		System.out.println(total);
	}
	
	public void printUniqueData() {
		List<String> names = Arrays.asList("Sam", "Peter","ballon","Sam");
		List<String> uniqueList = new ArrayList<String>();
		for(String name: names){
			if(!uniqueList.contains(name))
				uniqueList.add(name);
		}
		System.out.println(uniqueList);

	}

}
