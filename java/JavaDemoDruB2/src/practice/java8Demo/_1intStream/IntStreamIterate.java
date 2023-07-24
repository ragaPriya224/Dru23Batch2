package practice.java8Demo._1intStream;

import java.util.stream.IntStream;

public class IntStreamIterate {

	public static void main(String[] args) {

		IntStreamIterate d = new IntStreamIterate();
		d.m1();
	}
	public void m1() {

		IntStream.iterate(0, operand -> operand +2)
		.limit(20)
		.forEach(System.out::println);
		//				seed -> we begin with 0
		//				operand -> tells how to increment it








//
//
		System.out.println("even numbers");
//		//:LETS GET ALL EVEN NUMBERS FROM 0 TO 20
		IntStream.iterate(0, operand -> operand +1)
		.filter(index -> index %2 == 0)	
		.limit(20)
		.forEach(System.out::println);
//
		
		
		
		
		
		
//
//		//ANOTHER WAY :LETS GET ALL EVEN NUMBERS FROM 0 TO 20
		IntStream.range(0, 100)
		.filter(index -> index %2 ==0)
		.limit(20)
		.forEach(System.out::println);
	}

}
