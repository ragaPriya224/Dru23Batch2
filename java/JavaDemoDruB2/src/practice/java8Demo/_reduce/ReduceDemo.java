package practice.java8Demo._reduce;

import java.util.Arrays;

public class ReduceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReduceDemo d = new ReduceDemo();
		d.m1();
	}
	public void m1() {
		Integer[] integers = {1,2,3,4,99,100,121,1302,199};
		//add all no.s reduce
		Integer sum = Arrays.stream(integers)
		.reduce(0,(a,b)-> a +b);// identity -> 0
		// a ->0, b ->1 = 1
		// a -> 1, b ->2 = 3
		// a -> 3, b ->3 = 6
		
		System.out.println(sum);
	}

}
