package practice.java8Demo.UnderstandCollect;

import java.util.List;
import java.util.stream.Collectors;

import practice.java8Demo.entity.Car;
import practice.java8Demo.repository.CarRepository;

public class Demo {

	public static void main(String[] args) {
		Demo d = new Demo();
		d.m1();
	}
	public void m1() {
		List<Car> carList = CarRepository.getAllCars();
		List<String> output = carList.stream()
				.map(Car::getMake)
				//3 arguments -> supplier, accumulator, combiner
				//supplier -> returns data may be list or set...
//				.collect(() -> new ArrayList<String>()
						// accumulator 
//				,(list,element)-> list.add(element)
				//
//				,(list1,list2)-> list1.addAll(list2));
								.collect(Collectors.toList());
						output.forEach(System.out::println);
	}
}
