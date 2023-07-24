package practice.java8Demo._2MinMax;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinDemo d = new MinDemo();
		d.m1();
	}

	public void m1()   {
		List<Integer> numbersList = Arrays.asList(5, 2, 3, 100, 23, 93, 99);
		Integer minNumber = numbersList.stream()
				.min((number1,number2) -> number1 > number2 ? 1 :-1)
				.get();

		System.out.println(minNumber); //2

		// another easy way 
		Integer minimumNumber = numbersList.stream()
				.min(Comparator.naturalOrder())
				.get();
		System.out.println(minimumNumber); //2
		//
		//

	}


	//	public void max()   {
	//		final List<Integer> numbers = ImmutableList.of(1, 2, 3, 100, 23, 93, 99);
	//
	//	}

}
