package practice.java8Demo._5Stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamDiffWay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public void m1() {
		int[] markArray = {3,4,5,6,7};
		Arrays.stream(markArray)
		.forEach(System.out::println);
	}
	public void m2() {
		Stream.of(3,4,5,6,7)
		.forEach(System.out::println);
	}

}
