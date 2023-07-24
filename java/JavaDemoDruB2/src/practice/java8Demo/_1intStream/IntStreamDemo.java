package practice.java8Demo._1intStream;

import java.util.stream.IntStream;

public class IntStreamDemo {

	public static void main(String[] args) {

		IntStreamDemo d = new IntStreamDemo();
		d.java8Print();
	}
	public void normalLoop() {
		//normal java 
		//print 0 to 9
//		for(int i = 0;i<10;i++) {
//			System.out.println(i);
//		}

		System.out.println("for i");
		
		//print 0 to 10
		for(int j = 0;j<10;j++) {
			System.out.println(j); //print 0 to 10 
		}
	}
	public void java8Print() {
		IntStream.range(0, 10) //start inclu,end exclu
		.forEach(index -> System.out.println(index)); //o to 9
		//forEach -> consumer
		System.out.println("exclusive");

		//using method reference
		IntStream.range(0, 10).forEach(System.out::println);

		System.out.println("inclusive");

		//range closed
		IntStream.rangeClosed(0, 10).forEach(System.out::println);


	}

}
