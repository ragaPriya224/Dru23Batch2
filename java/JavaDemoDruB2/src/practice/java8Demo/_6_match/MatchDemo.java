package practice.java8Demo._6_match;

import java.util.stream.Stream;

//anymatch, 
public class MatchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MatchDemo d = new MatchDemo();
		d.m1();
		d.m2();
		d.m3();
	}

	//anyMatch
	// any names having uppercase at 0th index
	public void m1() {
		Stream<String> stream = Stream.of("Arun","prashanth","Hemanath","raghu","Aaqib");
		boolean bool = stream.anyMatch(name -> Character.isUpperCase(name.charAt(0)));
		System.out.println(bool);
	}

	//allMatch
	// all names must be having uppercase at 0th index
	public void m2() {
		Stream<String> stream = Stream.of("Arun","prashanth","Hemanath","raghu","Aaqib");
		boolean bool = stream.allMatch(name -> Character.isUpperCase(name.charAt(0)));
		System.out.println(bool);
	}
	//noneMatch(i.e., opp of all match )
	// none of the  names must be having uppercase at 0th index
	public void m3() {
		Stream<String> stream = Stream.of("Arun","prashanth","Hemanath","raghu","Aaqib");
		boolean bool = stream.noneMatch(name -> Character.isUpperCase(name.charAt(0)));
		System.out.println(bool);
	}

}
