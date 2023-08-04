package practice.java8Demo._10_joinString;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JoinString d = new JoinString();
		d.m2();
	}
	//without stream
	public void m1() {
		//concatenate names into one string joined by comma
		List<String> nameList = Arrays.asList("arun","aaqib","hemanath","prasanth","raghu");

		String join = "";
		for(String name: nameList) {
			join += name + ",";
		}
		System.out.println(join);
		//needed with space means
		System.out.println(join.substring(0,join.length()-2));
	}
	//with stream
	public void m2() {
		//concatenate names into one string joined by comma
		List<String> nameList = Arrays.asList("arun","aaqib","hemanath","prasanth","raghu");
		String joined = nameList.stream()
				.collect(Collectors.joining());
		System.out.println(joined);
		//		.collect(Collectors.joining(" , "));
		// may be map(String::toUpperCase)
	}



}
