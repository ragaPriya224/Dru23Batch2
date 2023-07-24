package main.exercise.section0._2MinMax;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxDemoExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxDemoExercise d = new MaxDemoExercise();
		d.m1();
	}
	
	public void m1()   {
		 List<Integer> numbersList = Arrays.asList(5, 2, 3, 100, 23, 93, 99);
	Integer max = numbersList.stream()
			.max(Comparator.naturalOrder())
			.get();
	System.out.println(max); //100
	
	}

}