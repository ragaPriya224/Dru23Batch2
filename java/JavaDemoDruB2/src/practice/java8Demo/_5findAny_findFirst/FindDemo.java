package practice.java8Demo._5findAny_findFirst;

import java.util.Arrays;
import java.util.function.Predicate;

public class FindDemo {
	final Predicate<Integer> numbersLessThan10 = n -> n > 5 && n < 10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindDemo d = new FindDemo();
//		d.findAny();
		d.findFirst();
	}
	  public void findAny()  {
		    Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		    int any = Arrays.stream(numbers)
		        .filter(numbersLessThan10)
		        .findAny()//finds any  element that satisfies the condition
		        .get();
		    System.out.println(any);
		  }

		  public void findFirst()   {
		    Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		    int first = Arrays.stream(numbers)
		        .filter(numbersLessThan10)
		        .findFirst()
		        .orElse(0);
		    System.out.println(first);
		  }
		  //findany - nondeterministic
		  //findfirst - deterministic(multiple run also same result)
		  
}
