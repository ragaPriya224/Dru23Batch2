package practice.java8Demo._5Stream;

import java.util.Arrays;
import java.util.List;

public class StreamVsParallelDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StreamVsParallelDemo d = new StreamVsParallelDemo();
//	d.streamDemo();
	d.parallelStreamDemo();
	}
	//single thread and predict the order
	public void streamDemo() {
		List<Integer> numberList = Arrays
				.asList(10,20,30,40);
		numberList.stream().forEach(n ->
		System.out.println(n + " "+
		Thread.currentThread().getName()));
	}
	//cannot predict the order
	//multiple threads
	public void parallelStreamDemo() {
		List<Integer> numberList = Arrays
				.asList(10,20,30,40);
		numberList.parallelStream().forEach(n ->
		System.out.println(n + " "+
		Thread.currentThread().getName()));
	}
	

}
